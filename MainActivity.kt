package com.example.gullycricket1

import TeamNamesViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gullycricket1.ui.theme.Gullycricket1Theme
import com.example.gullycricket1.ui.theme.MyApplicationTheme

//import com.google.firebase.auth.FirebaseAuth


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gullycricket1Theme {
                // A surface container using the 'background' color from the theme
                MyApplicationTheme {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val viewModel: TeamNamesViewModel = viewModel()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") { CreateMatchScreen(navController) }
        composable("match") { MatchTypeScreen(navController) }
        composable("2v2") { TwoVTwo(navController, viewModel) }
        composable("3v3") { ThreeVThree(navController, viewModel) }
        composable("4v4") { FourVfour(navController, viewModel) }
        composable("5v5") { FiveVfive(navController, viewModel) }
        composable("6v6") { SixVsix(navController, viewModel) }
        composable("7v7") { SevenVseven(navController, viewModel) }
        composable("8v8") { EightVEight(navController, viewModel) }
        composable("9v9") { Ninevnine(navController, viewModel) }
        composable("10v10") { TenVTen(navController, viewModel) }
        composable("11v11") { ElevenVEleven(navController, viewModel) }
        composable("11v11") { ElevenVEleven(navController, viewModel) }
        composable("to-names") { Teamnames(navController, viewModel) }
        composable("toss"){ Toss(navController, viewModel ) }
        composable("to-main"){ mainscorecard(navController, viewModel ) }
        composable("to-end"){ matchsummary(navController, viewModel ) }
    }
}


@Composable
fun CreateMatchScreen(navController: NavHostController) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = { navController.navigate("match") }, modifier = Modifier.size(width = 200.dp, height = 60.dp)) {
            Text(text = "Create Match",style= TextStyle(fontSize = 24.sp) )
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MatchTypeScreen(navController: NavHostController ) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Match Type") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
                Button(
                    onClick = {navController.navigate("2v2")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(text = "2v2")
                }
                Button(
                onClick = {navController.navigate("3v3")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                ) {
                Text(text = "3v3")
                }
            Button(
                onClick = {navController.navigate("4v4")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "4v4")
            }
            Button(
                onClick = {navController.navigate("5v5")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "5v5")
            }
            Button(
                onClick = {navController.navigate("6v6")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "6v6")
            }
            Button(
                onClick = {navController.navigate("7v7")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "7v7")
            }
            Button(
                onClick = {navController.navigate("8v8")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "8v8")
            }
            Button(
                onClick = {navController.navigate("9v9")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "9v9")
            }
            Button(
                onClick = {navController.navigate("10v10")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "10v10")
            }
            Button(
                onClick = {navController.navigate("11v11")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "11v11")
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(numFields: Int) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Input Fields") }
            )
        }
    ) {
        val textFieldValues = remember { mutableStateListOf<String>() }

        LaunchedEffect(numFields) {
            textFieldValues.clear()
            repeat(numFields) {
                textFieldValues.add("")
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            for (i in 0 until numFields) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextField(
                        value = textFieldValues[i],
                        onValueChange = { textFieldValues[i] = it },
                        label = { Text("Field ${i + 1}") },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    TextField(
                        value = textFieldValues[i],
                        onValueChange = { textFieldValues[i] = it },
                        label = { Text("Field ${i + 1}") },
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateMatchScreenPreview() {
    MyApplicationTheme {
        CreateMatchScreen(navController = rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun MatchTypeScreenPreview() {
    MyApplicationTheme {
        MatchTypeScreen(navController = rememberNavController())
    }
}


