package com.palpayel.gkquizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total+question"
    const val CORRECT_ANSWER:String="correct_answer"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
//Q1
        val que1 = Question(
            1, "Which other viruses belong to the Coronavirus family?",
            " SARS", "MERS",
            " Both a and b", "None of the above", 3
        )
        questionsList.add(que1)
//Q2
        val que2=Question(2," Where was the Kappa variant of Covid first found?","UK",
            "Australia",
                    "India",
                    "Pakistan",3
        )
        questionsList.add(que2)
//Q3
        val que3=Question(3,
            "Which scientist was the first to discover Coronavirus?",

                    "June Almeida",
                    "Shi Zhengli",
                    "Marion Koopmans",
                    "All of above",1
        )
        questionsList.add(que3)

        val que4=Question(4,
            "When did WHO come into force and what is the day called?",

            "7th April 1948, World Health Day",
            "7th April 1945, World Medicine Day",
            "10th April 1945, World Doctors Day",
            "8th April 1948, WHO Day",1
        )
        questionsList.add(que4)

     val que5=Question(5,
         "Where are the headquarters of WHO located?",
       " Geneva",
        "Hague",
         " New York",
         " Istanbul",
         1
        )
        questionsList.add(que5)
         val que6=Question(6,
    "Which UN member state has not been included in WHO?",

            "Niue",
            "Cook Islands",
            "Liechtenstein",
            "None of the above",
    3
        )
        questionsList.add(que6)


        val que7=Question(7,"What option does the central government not include in the development expenditure?",
               " A) Grants to states",
               " B) Expenditure on social and community services",
       " C) Expenditure on economic services",
        "D) Defence expenditure",4)
        questionsList.add(que7)


        val que8=Question(8,"With which of the following did the ARDC merged with on 12 July, 1982?",
      "  A) NABARD",
       " B) EXIM Bank",
       " C) RBI",
       " D) None of the above",1)
        questionsList.add(que8)

        val que9=Question(9,"What is the main cause of the export surplus?",
        "A) The country’s stringent import policy",
        "B) Developments in national and international markets",
        " C) The country’s exports promotion value",
        " D) None of the above",
            2)
        questionsList.add(que9)

        val que10=Question(10,"If RBI reduces the cash reserve ratio, what will happen to the credit creation?",
       " A) There will be no impact.",
        "B) It will decrease.",
      "  C) It will increase.",
       " D) None of the above",
            3)
        questionsList.add(que10)

        val que11=Question(11,"In Which option is not mentioned in a firm’s balance sheet?",
               " A) Cash held at the bank",
               " B) Revenue from sales of the company’s products",
        "C) Total issued capital",
        "D) Value of the stocks of raw materials held",
            2)
        questionsList.add(que11)

        val que12=Question(12,"The first complete Indian Bank was established in which year?",
                "A) 1794",
               " B) 1894",
                "C) 1896",
                  "D) 1902",
            2)
          questionsList.add(que12)

        val que13=Question(13,"The Central Rice Research Station is situated in?",
            "(a) Chennai",
                "(b) Cuttack",
                "(c) Bangalore",
                "(d) Quilon",
            2)
          questionsList.add(que13)

        val que14=Question(14,"Which one of the following river flows between Vindhyan and Satpura ranges?",
           " (a) Narmada",
              "  (b) Mahanadi",
               " (c) Son",
                "(d) Netravati",
            1)
        questionsList.add(que14)

        val que15=Question(15,"River Luni originates near Pushkar and drains into which one of the following?",
        "(a) Rann of Kachchh",
                "(b) Arabian Sea",
        "(c) Gulf of Cambay",
                "(d) Lake Sambhar",
            1)
        questionsList.add(que15)


        val que16=Question(16,"Which of the following is related to Bharat Nirman Scheme?",
            "(a) Foodgrain production self sufficiency",
           "(b) Family welfare programme",
                "(c) Infrastructure development",
          "(d) Employment generation program",
            3)
        questionsList.add(que16)

        val que17=Question(17," Eritrea, which became the 182nd member of the UN in 1993, is in the continent of",
                "A.Africa",
                "B.Australia",
                "C.Europe",
                "D.Asia",
            1)
        questionsList.add(que17)

        val que18=Question(18,"During World War II, when did Germany attack France?",
        "A.1940",
       " B.1941",
       " C.1942",
       " D.1943",
            1)
        questionsList.add(que18)


        val que19=Question(19,"Which of the following user-defined header file extension used in c++?",
        "a) hg",
       " b) cpp",
        "c) h",
       " d) hf",
       3)
        questionsList.add(que19)

        val que20=Question(20," What is C++?",
               " a) C++ is an object oriented programming language",
        "b) C++ is a procedural programming language",
       " c) C++ supports both procedural and object oriented programming language",
       " d) C++ is a functional programming language",
            1)
        questionsList.add(que20)



        return  questionsList
    }
}