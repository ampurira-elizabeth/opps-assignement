fun main(){
 var human=Human("beth",25,60)
   human.eat(45)
    println(human.weight)
    println(human.speak("i love kotlin programming language"))
    human.birthday()


    println()
var data=student("Ampurira","liz","ampuriraliz@gmail.com.",1178045637,"liz12a")
    println(data.firstname)
    println(data.lastname)
    //println(data.email)
    //println(data.phonenumber)
    //println(data.passward)



}
class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight


    }
    fun speak(speech:String){

    }
    fun birthday(){
        age+=1
        println(age)
    }

}
data class student(var firstname:String,var lastname:String,var email:String,var phonenumber:Int,var passward:String){

}

