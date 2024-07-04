package com.example.gullycricket1

import TeamNamesViewModel
import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import b
import innings
import ns
import s
import swapStrikerAndNonStriker
import teamBattingName
import teamBowlingName
import teamlength
import kotlin.random.Random


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Teamnames(navController: NavHostController, viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("Team Names") },
            actions = {
                Button(onClick = {navController.navigate("toss")}) {
                    Text("Next")
                }
            }
        )
    }){
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.teamname1,
                    onValueChange = { viewModel.teamname1 = it },
                    label = { Text("Team A") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.teamname2,
                    onValueChange = { viewModel.teamname2 = it },
                    label = { Text("Team B") },
                    modifier = Modifier.weight(1f)
                )
            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toss(navController: NavHostController,  viewModel: TeamNamesViewModel){

    fun randomizeToss() {
        viewModel.winner = if (Random.nextBoolean()) viewModel.teamname1 else viewModel.teamname2
    }
    Scaffold (topBar = {
        TopAppBar(
            title = { Text("Toss") },

        )
    }){
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text(viewModel.teamname1)
                Text("VS")
                Text(viewModel.teamname2)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextField(
                    value = viewModel.overnumberInput,
                    onValueChange = { newValue -> if (newValue.all { it.isDigit() }) {
                        viewModel.overnumberInput = newValue
                        viewModel.overnumber = newValue.toIntOrNull() ?: 0
                    } },
                    label = { Text("overs") },
                    modifier = Modifier.weight(1f)
                )
            }

            Button(onClick = { randomizeToss()}) {
                Text("Flip the coin")
            }
            viewModel.winner?.let {
                Text(
                    text = "The toss winner is: $it",
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
            Text(text = "And choose to")
            Row ( modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Button(onClick = {
                    viewModel.winnerchoice = "batting"
                    viewModel.winner?.let { if ( viewModel.winner==viewModel.teamname1){
                        teamBattingName=viewModel.teamname1
                        viewModel.teambatting.clear()
                        viewModel.teambatting.addAll(viewModel.teama)
                        viewModel.oneBatting.clear()
                        viewModel.oneBatting.addAll(viewModel.teama)
                        teamBowlingName=viewModel.teamname2
                        viewModel.teambowling.clear()
                        viewModel.teambowling.addAll(viewModel.teamb)
                    }else{
                        teamBattingName=viewModel.teamname2
                        viewModel.teambatting.clear()
                        viewModel.teambatting.addAll(viewModel.teamb)
                        viewModel.oneBatting.clear()
                        viewModel.oneBatting.addAll(viewModel.teamb)
                        teamBowlingName=viewModel.teamname1
                        viewModel.teambowling.clear()
                        viewModel.teambowling.addAll(viewModel.teama)
                    } }
                    navController.navigate("to-main") }) {
                    Text(text = "Batting")
                }
                Button(onClick = {
                    viewModel.winnerchoice = "bowling"
                    viewModel.winner?.let { if ( viewModel.winner==viewModel.teamname1){
                        teamBattingName=viewModel.teamname2
                        viewModel.teambatting.clear()
                        viewModel.teambatting.addAll(viewModel.teamb)
                        viewModel.oneBatting.clear()
                        viewModel.oneBatting.addAll(viewModel.teamb)
                        teamBowlingName=viewModel.teamname1
                        viewModel.teambowling.clear()
                        viewModel.teambowling.addAll(viewModel.teama)
                    }else{
                        teamBattingName=viewModel.teamname1
                        viewModel.teambatting.clear()
                        viewModel.teambatting.addAll(viewModel.teama)
                        viewModel.oneBatting.clear()
                        viewModel.oneBatting.addAll(viewModel.teama)
                        teamBowlingName=viewModel.teamname2
                        viewModel.teambowling.clear()
                        viewModel.teambowling.addAll(viewModel.teamb)
                    } }
                    navController.navigate("to-main") }) {
                    Text(text = "Bowling")
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainscorecard(navController: NavHostController,viewModel: TeamNamesViewModel){
    
    var bowlList by remember { mutableStateOf(false) }
    var batList by remember { mutableStateOf(false) }
    var e by remember { mutableStateOf(true) }
    var Out by remember { mutableStateOf(true) }
    val extra = listOf(1, 2, 3, 4, 5, 6)
    var tempname : String = ""
    val indices = remember { intArrayOf(0, 0) }
    var Scoreinglist1 = mutableStateListOf<Int>().apply { addAll(List(teamlength) { 0 }) }
    var Scoreinglist2 = mutableStateListOf<Int>().apply { addAll(List(teamlength) { 0 }) }
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Main Scorecard") },
            actions = {
                Button(onClick = {
                    innings++
                    viewModel.exchangeTeams()
                    tempname=teamBattingName
                    teamBattingName= teamBowlingName
                    teamBowlingName=tempname
                    viewModel.ballnum=0
                    b=false
                    s=false
                    ns=false
                    viewModel.oneBatting.clear()
                    viewModel.oneBatting.addAll(viewModel.teambatting)
                    if (innings>2){
                        navController.navigate("to-end")
                    }
                }) {
                    Text("End Innings")
                }
            }
        )
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement =Arrangement.SpaceBetween
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(style = TextStyle(fontSize = 48.sp ),text=  teamBattingName)
                if(innings==1){
                    Text(style = TextStyle(fontSize = 40.sp ),text=  "${viewModel.scoreinnings1st}/${viewModel.wicketsinnings1st} (${viewModel.currentover1st}.${viewModel.ballnum}/${viewModel.overnumber})")
                }else{
                    Text(style = TextStyle(fontSize = 40.sp ),text=  "${viewModel.scoreinnings2nd}/${viewModel.wicketsinnings2nd} (${viewModel.currentover2nd}.${viewModel.ballnum}/${viewModel.overnumber})")
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(style = TextStyle(fontSize = 36.sp ),text=  "Batters")
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                if (s){
                    Text(style = TextStyle(fontSize = 36.sp ),text=  viewModel.striker)
                }
                else{
                    Column {
                        Button(onClick = { batList = true}) {
                            Text(text = "Show list ${viewModel.teambatting.indexOf(tempname)}")
                        }
                        if(batList){
                            Column {
                                viewModel.oneBatting.forEach { item -> Text(item, modifier = Modifier.clickable {
                                    viewModel.striker=item
                                    tempname=item
                                    indices[0]= viewModel.teambatting.indexOf(tempname)
                                    if (viewModel.striker!=viewModel.nonstriker){
                                        batList =false
                                        s= true
                                        viewModel.removeItem(item)
                                    }
                                }) }
                            }
                        }
                    }
                }
                if(innings==1){
                    Text(text = "${Scoreinglist1[indices[0]]}")
                }else{
                    Text(text = "${Scoreinglist2[indices[0]]}")
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                if (ns){
                    Text(style = TextStyle(fontSize = 36.sp ),text=  viewModel.nonstriker)
                }
                else{
                    Column {
                        Button(onClick = { batList = true}) {
                            Text(text = "Show list${viewModel.teambatting.indexOf(tempname)}")
                        }
                        if(batList){
                            Column {
                                viewModel.oneBatting.forEach { item -> Text(item, modifier = Modifier.clickable {
                                    viewModel.nonstriker=item
                                    tempname=item
                                    indices[1] = viewModel.teambatting.indexOf(tempname)
                                    if (viewModel.striker!=viewModel.nonstriker){
                                        batList =false
                                        ns= true
                                        viewModel.removeItem(item)
                                    }
                                }) }
                            }
                        }
                    }
                }
                if(innings==1){
                    Text(text = "${Scoreinglist1[indices[1]]}")
                }else{
                    Text(text = "${Scoreinglist2[indices[1]]}")
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(style = TextStyle(fontSize = 36.sp ),text=  "Bowlers")
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                if (b){
                    Text(style = TextStyle(fontSize = 36.sp ),text=  viewModel.bowler)
                }
                else{
                    Column {
                        Button(onClick = { bowlList = true}) {
                            Text(text = "Show list")
                        }
                        if(bowlList){
                            Column {
                                viewModel.teambowling.forEach { item -> Text(item, modifier = Modifier.clickable {
                                    viewModel.bowler=item
                                    if (viewModel.prevbowler!=viewModel.bowler){
                                        bowlList =false
                                        b= true
                                    }
                                }) }
                            }
                        }
                    }
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 0 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "0",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 1 }
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "1",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 2 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "2",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 3 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "3",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 4 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "4",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 5 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "5",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(36.dp)
                        .clickable { viewModel.ballscore = 6 } // Adjust the size as needed
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        drawCircle(
                            color = Color.Red,
                            radius = size.minDimension / 2,
                            center = center
                        )
                    }
                    Text(
                        text = "6",
                        color = Color.White,
                        fontSize = 16.sp // Adjust font size as needed
                    )
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(style = TextStyle(fontSize = 30.sp),  text = "Extras:")
                if (e){
                    Button(onClick = { e = false}) {
                        Text(text = "Show list")
                    }
                }
                else{
                    Row {
                                extra.forEach { item -> Text(item.toString(), style = TextStyle(fontSize = 30.sp), modifier = Modifier
                                    .clickable {
                                        viewModel.scoreinnings1st += item
                                        e = true
                                    }
                                    .padding(8.dp)) }
                    }
                }

                if (Out){
                    Button(onClick = { Out = false}) {
                        Text(text = "Wicket")
                    }
                }
                else{
                    Row {
                       Text(text = viewModel.striker, modifier = Modifier.clickable {
                           Out = true
                           s= false

                           if(innings==1){
                               viewModel.wicketsinnings1st++
                           }else{
                               viewModel.wicketsinnings2nd++
                           }
                           viewModel.ballnum++
                           if (viewModel.ballnum==6){
                               viewModel.currentover1st++
                               viewModel.ballnum=0
                               viewModel.prevbowler=viewModel.bowler
                               b=false
                           }
                       })
                        Text(text = viewModel.nonstriker, modifier = Modifier.clickable {
                            Out = true
                            ns= false
                            if(innings==1){
                                viewModel.wicketsinnings1st++
                            }else{
                                viewModel.wicketsinnings2nd++
                            }
                            viewModel.ballnum++
                            if (viewModel.ballnum==6){
                                viewModel.currentover1st++
                                viewModel.ballnum=0
                                viewModel.prevbowler=viewModel.bowler
                                b=false
                            }
                        })
                    }
                }
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text(style = TextStyle(fontSize = 36.sp),text = "Score: ${viewModel.ballscore} ")
                Button(onClick = {
                    if (innings==1){
                        if (viewModel.currentover1st!=viewModel.overnumber){
                            if (b && s && ns){
                                viewModel.scoreinnings1st=viewModel.scoreinnings1st+viewModel.ballscore
                                Scoreinglist1[indices[0]]+= viewModel.ballscore
                                viewModel.ballnum++
                            }
                            if(viewModel.ballscore==1 || viewModel.ballscore==3 || viewModel.ballscore==5 ){
                                swapStrikerAndNonStriker(viewModel,indices)
                            }
                            if (viewModel.ballnum==6){
                                viewModel.currentover1st++
                                viewModel.ballnum=0
                                viewModel.prevbowler=viewModel.bowler
                                b=false
                                swapStrikerAndNonStriker(viewModel,indices)
                            }
                        }
                    }else {
                        if (viewModel.currentover2nd!=viewModel.overnumber){
                            if (b && s && ns){
                                viewModel.scoreinnings2nd=viewModel.scoreinnings2nd+viewModel.ballscore
                                Scoreinglist2[indices[0]]+= viewModel.ballscore
                                viewModel.ballnum++
                            }
                            if(viewModel.ballscore==1 || viewModel.ballscore==3 || viewModel.ballscore==5 ){
                                swapStrikerAndNonStriker(viewModel,indices)
                            }
                            if (viewModel.ballnum==6){
                                viewModel.currentover2nd++
                                viewModel.ballnum=0
                                viewModel.prevbowler=viewModel.bowler
                                b=false
                                swapStrikerAndNonStriker(viewModel,indices)
                            }
                        }
                    }

                }) {
                    Text(text = "Add score")
                }
            }
        }
    }
}

@Composable
fun matchsummary(navController: NavHostController,viewModel: TeamNamesViewModel){
    Column {
        Text(text = "Team winner")
        if (viewModel.scoreinnings1st>viewModel.scoreinnings2nd && viewModel.teambowling==viewModel.teama ){
            Row {
                Column(modifier = Modifier.padding(16.dp)) {
                    viewModel.teama.forEach { player ->
                        Text(text = player)
                    }
                }
            }
        }else {
            Row {
                Column(modifier = Modifier.padding(16.dp)) {
                    viewModel.teamb.forEach { player ->
                        Text(text = player)
                    }
                }
            }
        }
        Text(text = "Team Loser")
        if (viewModel.scoreinnings1st>viewModel.scoreinnings2nd && viewModel.teambowling==viewModel.teama ){

            Row {
                Column(modifier = Modifier.padding(16.dp)) {
                    viewModel.teamb.forEach { player ->
                        Text(text = player)
                    }
                }
            }
        }else {
            Row {
                Column(modifier = Modifier.padding(16.dp)) {
                    viewModel.teama.forEach { player ->
                        Text(text = player)
                    }
                }
            }
        }
    }
}

