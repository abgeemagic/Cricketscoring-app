
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

var teamlength:Int = 0

var teamBattingName : String = ""
var teamBowlingName : String = ""
var b : Boolean = false
var s : Boolean = false
var ns : Boolean = false
var innings : Int = 1
fun swapStrikerAndNonStriker(
    viewModel: TeamNamesViewModel,
    indices: IntArray
) {
    val tempStriker = viewModel.striker
    viewModel.striker = viewModel.nonstriker
    viewModel.nonstriker = tempStriker

    var tempIndex = indices[0]
    indices[0] = indices[1]
    indices[1] = tempIndex
}


class TeamNamesViewModel : ViewModel() {
    var winnerchoice: String = ""
    var scoreinnings1st : Int = 0
    var scoreinnings2nd : Int = 0
    var wicketsinnings1st : Int = 0
    var currentover1st : Int = 0
    var wicketsinnings2nd : Int = 0
    var currentover2nd : Int = 0
    var ballnum by mutableStateOf<Int>(0)
    var ballscore by mutableStateOf<Int>(0)
    var striker by mutableStateOf("")
    var nonstriker by mutableStateOf("")
    var bowler: String = "noth"
    var prevbowler : String = ""
    var teamname1 by mutableStateOf("")
    var teamname2 by mutableStateOf("")
    var winner by mutableStateOf<String?>(null)
    var overnumber by mutableStateOf(0)
    var overnumberInput by mutableStateOf("")
    var teama = mutableStateListOf<String>()
    var teamb = mutableStateListOf<String>()
    var teambatting = mutableStateListOf<String>()
    var oneBatting = mutableStateListOf<String>()
    var teambowling = mutableStateListOf<String>()
    fun initializeTeams(teamLength: Int) {
        teama.clear()
        teamb.clear()
        repeat(teamLength) {
            teama.add("")
            teamb.add("")
        }
    }
    fun removeItem(item: String) {
        oneBatting.remove(item)
    }
    fun exchangeTeams() {
        val temp = teambatting.toList()
        teambatting.clear()
        teambatting.addAll(teambowling)
        teambowling.clear()
        teambowling.addAll(temp)
    }

    var p1 by  mutableStateOf("")
    var p2 by  mutableStateOf("")
    var p3 by  mutableStateOf("")
    var p4 by  mutableStateOf("")
    var p5 by  mutableStateOf("")
    var p6 by  mutableStateOf("")
    var p7 by  mutableStateOf("")
    var p8 by  mutableStateOf("")
    var p9 by  mutableStateOf("")
    var p10 by  mutableStateOf("")
    var p11 by  mutableStateOf("")
    var p12 by  mutableStateOf("")
    var p13 by  mutableStateOf("")
    var p14 by  mutableStateOf("")
    var p15 by  mutableStateOf("")
    var p16 by  mutableStateOf("")
    var p17 by  mutableStateOf("")
    var p18 by  mutableStateOf("")
    var p19 by  mutableStateOf("")
    var p20 by  mutableStateOf("")
    var p21 by  mutableStateOf("")
    var p22 by  mutableStateOf("")
}