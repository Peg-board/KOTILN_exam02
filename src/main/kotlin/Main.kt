fun main(args: Array<String>) {

//    var count : Int = 85
//    if(count >= 90)
//        println("if문: 합격(장학생)")
//    else if (count >= 60)
//        println("if문: 합격")
//    else
//        println("if문: 불합격")
//
//    var jumsu : Int = (count / 10) *10
//    println("jumsu: $jumsu")
//    when(jumsu){
//        100 -> println("when문: 합격(장학생)")
//        90 -> println("when문: 합격(장학생)")
//        80, 70, 60 -> println("when문: 합격")
//        else -> println("when문: 불합격")
//    }

    ////////////////////////////////////////////////////////////////////////////////

    var jumsu : Int = 85
    when(jumsu){
        in 90..100 -> println("when문: 합격(장학생)")
        in 60..89 -> println("when문: 합격")
        else -> println("when문: 불헙격")
    }
}

