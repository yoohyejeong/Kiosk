package com.example.kiosk

fun main() {
    while (true) {
        println("<달콤 탕후루 메뉴판>")

        println("1. 달콤 과일 탕후루")
        println("2. 아삭 야채 탕후루")
        println("3. 달콤 특제 과일주스")
        println("0. 키오스크 종료 ")
        var choiceMenu = readLine()!!.toInt()
        if((choiceMenu == 1 || choiceMenu == 2 || choiceMenu == 3 || choiceMenu == 0)) {


            when (choiceMenu) {
                1 -> {
                    println("<달콤 과일 탕후루>")
                    println("1. 달콤 딸기 탕후루")
                    println("2. 달콤 샤인머스캣 탕후루")
                    println("3. 달콤 귤 탕후루")
                    println("4. 달콤 블루베리 탕후루")

                    var choiceFruit = readLine()!!.toInt()
                    println("카트에 담았습니다.")


                }


                2 -> {
                    println("<아삭 야채 탕후루>")
                    println("1. 아삭 오이 탕후루")
                    println("2. 아삭 당근 탕후루")
                    println("3. 아삭 고구마 탕후루")
                    println("4. 아삭 호박 탕후루")

                    var choiceVege = readLine()!!.toInt()
                    println("카트에 담았습니다.")
                }

                3 -> {
                    println("<달콤 특제 과일주스>")
                    println("1. 달콤 딸기 주스")
                    println("2. 달콤 망고 주스")
                    println("3. 달콤 수박 주스")
                    println("4. 달콤 바나나 주스")

                    var choiceJuice = readLine()!!.toInt()
                    println("카트에 담았습니다.")
                }

                0 -> {
                    println("키오스크을 종료합니다.")
                    break
                }
            }
        } else {
            println("올바른 번호를 입력해 주세요")
            break

        }
}
}
