package com.thecodebench.simplequizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Which file extension is used to save Kotlin files.",

            ".java",
            ".kt",
            ".mp4",
            ".kot",
            2
        )
        var question2 = QuestionData(
            2,
            " What is correct way to create an arraylist in Kotlin?",

            "enum class Color {RED, GREEN, BLUE}",
            "val map = hashMapOf(1 to \"one\", 2 to \"two\", 3 to \"three\")",
            "val list = arrayListOf(1, 2, 3)",
            "None of the above",
            3
        )
        var question3 = QuestionData(
            3,
            "What is an immutable variable?",

            "A variable that cannot change, read-only",
            " A variable that can be changed, read-write",
            "A variable used for string interpolation",
            "None of the above",
            1
        )
        var question4 = QuestionData(
            4,
            " How to make a multi lined comment in Kotlin?",

            " //",
            "/* */",
            "<!--- -->",
            "{* *}",
            2
        )

        var question5 = QuestionData(
            5,
            "How do you get the length of a string in Kotlin?",

            "length(str)",
            "str.lengthOf",
            "str.length",
            "str.length()",
            3
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}