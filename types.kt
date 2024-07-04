package com.example.gullycricket1
import TeamNamesViewModel
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import teamlength

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TwoVTwo(navController: NavHostController,viewModel: TeamNamesViewModel){
    Scaffold (topBar = {
        TopAppBar(
            title = { Text("2v2") },
            actions = {
                Button(onClick = {
                    teamlength =2
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {  viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = { viewModel.p2 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = { viewModel.p3 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = { viewModel.p4 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThreeVThree(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("3v3") },
            actions = {
                Button(onClick = {
                    teamlength =3
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6

                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = {viewModel.p2 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = { viewModel.p3 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = { viewModel.p4 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = {viewModel.p5 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FourVfour(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("4v4") },
            actions = {
                Button(onClick = {
                    teamlength =4
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = {viewModel.p2 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = {viewModel.p4 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = { viewModel.p5 = it},
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = { viewModel.p6 = it},
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = { viewModel.p7 = it},
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p8,
                    onValueChange = {viewModel.p8 = it},
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FiveVfive(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("5v5") },
            actions = {
                Button(onClick = {
                    teamlength =5
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = {viewModel.p2 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = {viewModel.p4 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = {viewModel.p5 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = {viewModel.p7 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value =viewModel.p8,
                    onValueChange = {viewModel.p8 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = {viewModel.p9 = it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = {viewModel.p10 = it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SixVsix(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("6v6") },
            actions = {
                Button(onClick = {
                    teamlength =6
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = { viewModel.p2 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = {viewModel.p4 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = {viewModel.p5 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = {viewModel.p7 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value =viewModel.p8,
                    onValueChange = {viewModel.p8 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = { viewModel.p9 = it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = {viewModel.p10 = it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p11,
                    onValueChange = {viewModel.p11 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p12,
                    onValueChange = {viewModel.p12 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SevenVseven(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("7v7") },
            actions = {
                Button(onClick = {
                    teamlength =7
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    viewModel.teama[6]=viewModel.p13
                    viewModel.teamb[6]=viewModel.p14

                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = {viewModel.p1 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = { viewModel.p2 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = {viewModel.p4 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = {viewModel.p5 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = {viewModel.p7 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p8,
                    onValueChange = {viewModel.p8 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = { viewModel.p9 = it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = { viewModel.p10= it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p11,
                    onValueChange = { viewModel.p11 = it},
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p12,
                    onValueChange = {viewModel.p12 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p13,
                    onValueChange = {viewModel.p13 = it },
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p14,
                    onValueChange = { viewModel.p14 = it},
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EightVEight(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("8v8") },
            actions = {
                Button(onClick = {
                    teamlength =8
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    viewModel.teama[6]=viewModel.p13
                    viewModel.teamb[6]=viewModel.p14
                    viewModel.teama[7]=viewModel.p15
                    viewModel.teamb[7]=viewModel.p16

                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = { viewModel.p1 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = { viewModel.p2 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = { viewModel.p3 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = { viewModel.p4 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = { viewModel.p5 = it},
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = {viewModel.p7 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p8,
                    onValueChange = { viewModel.p8 = it},
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = {viewModel.p9= it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = {viewModel.p10 = it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p11,
                    onValueChange = { viewModel.p11 = it},
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p12,
                    onValueChange = {viewModel.p12 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p13,
                    onValueChange = { viewModel.p13 = it},
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p14,
                    onValueChange = {viewModel.p14 = it },
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p15,
                    onValueChange = { viewModel.p15 = it},
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p16,
                    onValueChange = {viewModel.p16 = it },
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ninevnine(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("9v9") },
            actions = {
                Button(onClick = {
                    teamlength =9
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    viewModel.teama[6]=viewModel.p13
                    viewModel.teamb[6]=viewModel.p14
                    viewModel.teama[7]=viewModel.p15
                    viewModel.teamb[7]=viewModel.p16
                    viewModel.teama[8]=viewModel.p17
                    viewModel.teamb[8]=viewModel.p18
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = { viewModel.p1 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = {viewModel.p2 = it },
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = { viewModel.p4 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = {viewModel.p5 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = { viewModel.p7 = it},
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p8,
                    onValueChange = { viewModel.p8 = it},
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = { viewModel.p9 = it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = { viewModel.p10 = it},
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p11,
                    onValueChange = {viewModel.p11 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p12,
                    onValueChange = {viewModel.p12 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p13,
                    onValueChange = {viewModel.p13 = it },
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p14,
                    onValueChange = { viewModel.p14 = it},
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p15,
                    onValueChange = { viewModel.p15 = it},
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p16,
                    onValueChange = {viewModel.p16 = it },
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p17,
                    onValueChange = { viewModel.p17 = it},
                    label = { Text("Player 9") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p18,
                    onValueChange = {viewModel.p18 = it },
                    label = { Text("Player 9") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TenVTen(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("10v10") },
            actions = {
                Button(onClick = {
                    teamlength =10
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    viewModel.teama[6]=viewModel.p13
                    viewModel.teamb[6]=viewModel.p14
                    viewModel.teama[7]=viewModel.p15
                    viewModel.teamb[7]=viewModel.p16
                    viewModel.teama[8]=viewModel.p17
                    viewModel.teamb[8]=viewModel.p18
                    viewModel.teama[9]=viewModel.p19
                    viewModel.teamb[9]=viewModel.p20
                    navController.navigate("to-names")}) {
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
                    value = viewModel.p1,
                    onValueChange = { viewModel.p1 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p2,
                    onValueChange = { viewModel.p2 = it},
                    label = { Text("Player 1") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p3,
                    onValueChange = {viewModel.p3 = it },
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p4,
                    onValueChange = { viewModel.p4 = it},
                    label = { Text("Player 2") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p5,
                    onValueChange = { viewModel.p5 = it},
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p6,
                    onValueChange = {viewModel.p6 = it },
                    label = { Text("Player 3") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p7,
                    onValueChange = {viewModel.p7 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p8,
                    onValueChange = {viewModel.p8 = it },
                    label = { Text("Player 4") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p9,
                    onValueChange = {viewModel.p9 = it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p10,
                    onValueChange = {viewModel.p10 = it },
                    label = { Text("Player 5") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p11,
                    onValueChange = {viewModel.p11 = it },
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p12,
                    onValueChange = { viewModel.p12 = it},
                    label = { Text("Player 6") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p13,
                    onValueChange = {viewModel.p13 = it },
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p14,
                    onValueChange = { viewModel.p14 = it},
                    label = { Text("Player 7") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p15,
                    onValueChange = {viewModel.p15 = it },
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p16,
                    onValueChange = { viewModel.p16 = it},
                    label = { Text("Player 8") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p17,
                    onValueChange = {viewModel.p17 = it },
                    label = { Text("Player 9") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p18,
                    onValueChange = {viewModel.p18 = it },
                    label = { Text("Player 9") },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){

                TextField(
                    value = viewModel.p19,
                    onValueChange = { viewModel.p19 = it},
                    label = { Text("Player 10") },
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                TextField(
                    value = viewModel.p20,
                    onValueChange = { viewModel.p20 = it},
                    label = { Text("Player 10") },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ElevenVEleven(navController: NavHostController,viewModel: TeamNamesViewModel){

    Scaffold (topBar = {
        TopAppBar(
            title = { Text("11v11") },
            actions = {
                Button(onClick = {
                    teamlength =11
                    viewModel.initializeTeams(teamlength)
                    viewModel.teama[0]=viewModel.p1
                    viewModel.teamb[0]=viewModel.p2
                    viewModel.teama[1]=viewModel.p3
                    viewModel.teamb[1]=viewModel.p4
                    viewModel.teama[2]=viewModel.p5
                    viewModel.teamb[2]=viewModel.p6
                    viewModel.teama[3]=viewModel.p7
                    viewModel.teamb[3]=viewModel.p8
                    viewModel.teama[4]=viewModel.p9
                    viewModel.teamb[4]=viewModel.p10
                    viewModel.teama[5]=viewModel.p11
                    viewModel.teamb[5]=viewModel.p12
                    viewModel.teama[6]=viewModel.p13
                    viewModel.teamb[6]=viewModel.p14
                    viewModel.teama[7]=viewModel.p15
                    viewModel.teamb[7]=viewModel.p16
                    viewModel.teama[8]=viewModel.p17
                    viewModel.teamb[8]=viewModel.p18
                    viewModel.teama[9]=viewModel.p19
                    viewModel.teamb[9]=viewModel.p20
                    viewModel.teama[10]=viewModel.p21
                    viewModel.teamb[10]=viewModel.p22
                    navController.navigate("to-names")}) {
                    Text("Next")
                }
            }
        )
    }){
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextField(
                        value = viewModel.p1,
                        onValueChange = { viewModel.p1 = it},
                        label = { Text("Player 1") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p2,
                        onValueChange = {viewModel.p2 = it },
                        label = { Text("Player 1") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextField(
                        value = viewModel.p3,
                        onValueChange = {viewModel.p3 = it },
                        label = { Text("Player 2") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p4,
                        onValueChange = { viewModel.p4 = it},
                        label = { Text("Player 2") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p5,
                        onValueChange = { viewModel.p5 = it},
                        label = { Text("Player 3") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p6,
                        onValueChange = {viewModel.p6 = it },
                        label = { Text("Player 3") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p7,
                        onValueChange = { viewModel.p7 = it},
                        label = { Text("Player 4") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p8,
                        onValueChange = { viewModel.p8 = it},
                        label = { Text("Player 4") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p9,
                        onValueChange = {viewModel.p9 = it },
                        label = { Text("Player 5") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p10,
                        onValueChange = { viewModel.p10 = it},
                        label = { Text("Player 5") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p11,
                        onValueChange = {viewModel.p11 = it },
                        label = { Text("Player 6") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p12,
                        onValueChange = {viewModel.p12 = it },
                        label = { Text("Player 6") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p13,
                        onValueChange = { viewModel.p13 = it},
                        label = { Text("Player 7") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p14,
                        onValueChange = { viewModel.p14 = it},
                        label = { Text("Player 7") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p15,
                        onValueChange = {viewModel.p15 = it },
                        label = { Text("Player 8") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p16,
                        onValueChange = {viewModel.p16 = it },
                        label = { Text("Player 8") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p17,
                        onValueChange = { viewModel.p17 = it},
                        label = { Text("Player 9") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p18,
                        onValueChange = {viewModel.p18 = it },
                        label = { Text("Player 9") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p19,
                        onValueChange = { viewModel.p19 = it},
                        label = { Text("Player 10") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p20,
                        onValueChange = {viewModel.p20 = it },
                        label = { Text("Player 10") },
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextField(
                        value = viewModel.p21,
                        onValueChange = { viewModel.p21 = it},
                        label = { Text("Player 11") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = viewModel.p22,
                        onValueChange = {viewModel.p22 = it },
                        label = { Text("Player 11") },
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }

}