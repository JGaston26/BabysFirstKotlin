fun main(){
    var magicName = "doesn't exist"
    print("What is your name: ")
    val name = readln()
    println("Hello $name!")
    print("What's your favorite number: ")
    val num = readln().toInt()
    println("Your favorite number is $num")
    if(name != "" && num != 0) {
        magicName = name + num
        print("Your magic name is: $magicName")
    }else{
        print("Your magic name $magicName")
    }
}
