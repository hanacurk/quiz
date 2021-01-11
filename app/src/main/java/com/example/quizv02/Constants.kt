package com.example.quizv02

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val CLICKED: String = "clicked"

    fun GetQuestionsSlovenija(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "Koliko metrov je visok Triglav?",
            R.drawable.triglav,
            "2928",
            "2849",
            "2864",
            "2842",
            3
        )

        questionList.add(que1)

        val que2 = Question(1,
            "Kdaj se je rodil France Prešeren?",
            R.drawable.fp,
            "1750",
            "1800",
            "1880",
            "1700",
            2
        )

        questionList.add(que2)

        val que3 = Question(1,
            "Kdo je napisal prvo slovensko knjigo?",
            R.drawable.pt,
            "France Prešeren",
            "Primož Trubar",
            "Valentin Vodnik",
            "Janez Vajkard Valvasor",
            2
        )

        questionList.add(que3)

        val que4 = Question(1,
                "Kateri so prvi zapisi v slovenščini?",
                R.drawable.bz,
                "Brižinski spomeniki",
                "Zimske urice",
                "Abecednik",
                "Katekizem",
                1
                )

        questionList.add(que4)

        val que5 = Question(1,
                "Koliko metrov meri naša obala?",
                R.drawable.obala,
                "35124",
                "43157",
                "41728",
                "38295",
                2
                )

        questionList.add(que5)

        val que6 = Question(1,
                "Katero je najstarejše mesto v Sloveniji?",
                R.drawable.ptuj,
                "Celje","Maribor", "Ljubljana", "Ptuj",
                4
                )

        questionList.add(que6)

        val que7 = Question(1,
                "Koliko prebivalcev ima Ljubljana? (2016)", R.drawable.lj, "279.631", "285.245", "180.325", "294.479", 1)

        questionList.add(que7)

        val que8 = Question(1,
                "koliko občin ima Slovenija?",
                R.drawable.obcine,
                "292","282","222","212", 4
                )

        questionList.add(que8)

        val que9 = Question(1, "Kdaj je dan državnosti?", R.drawable.dan, "26.december", "25.december", "25.junij", "8.februar", 3)
        questionList.add(que9)
        val que10 = Question(1, "Katera reka teče po Beli krajini?", R.drawable.kolpa, "Sava", "Krka", "Kolpa", "Drava", 3)
        questionList.add(que10)

        return questionList
    }

    fun GetQuestionsZgodovina(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
                "Kdo je osnoval dinastijo Xia v stari Kitajski?",
                R.drawable.kitajska,
                "Tang",
                "Yu",
                "Qui",
                "Shun",
                2
        )

        questionList.add(que1)

        val que2 = Question(1,
                "Kje so bili zametki starogrške civilizacije?",
                R.drawable.starogrska,
                "Kreta",
                "Rodos",
                "Olimpija",
                "Samos",
                1
        )

        questionList.add(que2)

        val que3 = Question(1,
                "Kateri zgodovinski dogodek se je zgodil leta 64 NŠ v Rimu?",
                R.drawable.rim,
                "Goti razrušijo Rim",
                "Tretja punska vojna",
                "Rim zgori",
                "Umor Julija Cezarja",
                3
        )

        questionList.add(que3)

        val que4 = Question(1,
                "Kaj so Rimljani zgradili v Veliki Britaniji, da bi ločili Rimljane od severnih barbarov?",
                R.drawable.hadrijanov,
                "Hadrijanov zid",
                "Hanibalov zid",
                "Kleonov zid",
                "Julijanov zid",
                1
        )

        questionList.add(que4)

        val que5 = Question(1,
                "Kdo je izdelal prvi zemljevid sveta?",
                R.drawable.prvizemljevid,
                "Krištof Kolumb",
                "Euklid",
                "Anaximander",
                "Arhimed",
                3
        )

        questionList.add(que5)

        val que6 = Question(1,
                "Kdaj so bile prve olipmijske igre?",
                R.drawable.oi,
                "776 PNŠ","112 PNŠ", "6 NŠ", "432 PNŠ",
                1
        )

        questionList.add(que6)

        val que7 = Question(1,
                "Katerega rimskega cesarja so ugrabili pirati in zanj dobili 12.000 zlatnikov?", R.drawable.jc, "Avgust", "Julij Cezar", "Nero", "Kaligula", 2)

        questionList.add(que7)

        val que8 = Question(1,
                "Katero mesto je bilo prvo glavno mesto starega Egipta?",
                R.drawable.egipt,
                "Aleksandrija","Memfis","Tebe","Kairo", 2
        )

        questionList.add(que8)

        val que9 = Question(1, "Koliko let je trajala Peloponeška vojna?", R.drawable.vojna, "39", "54", "27", "49", 3)
        questionList.add(que9)
        val que10 = Question(1, "Kdo je odkril Ameriko?", R.drawable.odkritje, "Marco Polo", "Leif Eriksson", "Krištof Kolumb", "Guanahani", 3)
        questionList.add(que10)

        return questionList
    }

    fun GetQuestionsZnanost(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
                "Kaj je Rimska cesta?",
                R.drawable.rc,
                "Skupina zvezd v vesolju.",
                "Galaksija, ki ji pripada tudi Osončje.",
                "Našemu SOncu najbližja zvezda.",
                "Cesta, ki pelje iz Ljubljane v Rim.",
                2
        )

        questionList.add(que1)

        val que2 = Question(1,
                "Kaj od naštetega je primer genskega inženiringa??",
                R.drawable.gi,
                "Gojenje rastline iz ene celice",
                "Pritrditev korenin ene vrste rastlin na steblo druge vrste rastlin",
                "Vstavitev gena v rastline, zaradi česar so odporne na žuželke",
                "Iskanje zaporedij baz v rastlininem DNA",
                3
        )

        questionList.add(que2)

        val que3 = Question(1,
                "Kaj je glavni vzrok letnih časov na Zemlji?",
                R.drawable.letnicasi,
                "Hitrost vrtenja zemlje",
                "Spremembe v količini energije, ki prihaja iz sonca",
                "Nagib zemeljske osi glede na sonce",
                "Razdalja med zemljo in soncem",
                3
        )

        questionList.add(que3)

        val que4 = Question(1,
                "Čas, ki ga računalnik zažene, se je močno povečal. Ena od možnih razlag za to je, da računalniku zmanjkuje pomnilnika. Ta razlaga je ...",
                R.drawable.hipoteza,
                "... znanstveno opazovanje",
                "... zaključek",
                "... poskus",
                "... hipoteza",
                4
        )

        questionList.add(que4)

        val que5 = Question(1,
                "Mnoge bolezni imajo inkubacijsko dobo. Kaj od naslednjega najbolje opisuje, kaj je inkubacijsko obdobje?",
                R.drawable.karantena,
                "Učinek bolezni na dojenčke.",
                "Obdobje, v katerem si nekdo ustvari imunost na bolezni.",
                "Obdobje, v katerem ima nekdo okužbo, vendar ne kaže simptomov.",
                "Obdobje okrevanja po bolezni.",
                3
        )

        questionList.add(que5)

        val que6 = Question(1,
                "Ko se odstranijo velike površine gozda, da se zemljišča lahko spremenijo za druge namene, na primer za kmetovanje, kaj se od naslednjega zgodi?",
                R.drawable.gozd,
                "Povečana erozija.","Zmanjšan ogljikov dioksid.", "Hladnejša temperatura.", "Večja proizvodnja kisika.",
                1
        )

        questionList.add(que6)

        val que7 = Question(1,
                "Antacid lajša preveč kisel želodec, ker so glavne sestavine antacidov ...", R.drawable.baze, "... baze", "...  nevtrali", "... izotopi", "... kisline", 1)

        questionList.add(que7)

        val que8 = Question(1,
                "Kaj od tega je največja skrb zaradi prekomerne uporabe antibiotikov?",
                R.drawable.antibiotiki,
                "Lahko povzroči bakterije, odporne na antibiotike.","Primanjkovanje antibiotikov.","Antibiotiki lahko povzročijo sekundarne okužbe.","Antibiotiki lahko pridejo v vodni sistem.", 1
        )

        questionList.add(que8)

        val que9 = Question(1, "Avto potuje s konstantno hitrostjo 64 km na uro. Kako daleč vozi avto v 45 minutah?", R.drawable.avto, "40 km", "48 km", "56 km", "64 km", 2)
        questionList.add(que9)
        val que10 = Question(1, "Nafta, zemeljski plini in premog so ...?", R.drawable.nafta, "... biogoriva", "... fosilna goriva", "... obnovljivi viri", "... geotemalni viri", 2)
        questionList.add(que10)

        return questionList
    }

    fun GetQuestionsOtroci(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
                "Katera žival ne živi v Sloveniji?",
                R.drawable.zivali,
                "Antilopa",
                "Rjavi medved",
                "Kača",
                "Netopir",
                1
        )

        questionList.add(que1)

        val que2 = Question(1,
                "Katera žival ne nese jajc??",
                R.drawable.petelin,
                "Kokoš",
                "goska",
                "raca",
                "petelin",
                4
        )

        questionList.add(que2)

        val que3 = Question(1,
                "Katero je glavno mesto Italije?",
                R.drawable.rim,
                "Benetke",
                "Rim",
                "Milan",
                "Firence",
                2
        )

        questionList.add(que3)

        val que4 = Question(1,
                "Katera žival je dvoživka?",
                R.drawable.zaba,
                "Riba",
                "Rak",
                "Macka",
                "Žaba",
                4
        )

        questionList.add(que4)

        val que5 = Question(1,
                "Kdo je France Prešeren?",
                R.drawable.fp,
                "pisatelj",
                "ilstrator",
                "pesnik",
                "pevec",
                3
        )

        questionList.add(que5)

        val que6 = Question(1,
                "Katera država NE meji s Slovenijo?",
                R.drawable.nemcija,
                "Madžarska","Italija", "Nemčija", "Avstrija",
                3
        )

        questionList.add(que6)

        val que7 = Question(1,
                "Katera pesem je slovenska himna?", R.drawable.himna, "Narodi", "Zdravljica", "Naša Slovenija", "Žive naj vsi narodi", 2)

        questionList.add(que7)

        val que8 = Question(1,
                "Kdaj praznujemo božič?",
                R.drawable.bozic,
                "25.januarja","26.decembra","5.decembra","25.decembra", 4
        )

        questionList.add(que8)

        val que9 = Question(1, "Katera žival je kralj živali?", R.drawable.kralj, "Šimpanz", "Lev", "Slon", "Medved", 2)
        questionList.add(que9)
        val que10 = Question(1, "Kakšne oblike pravimo da je Slovenija?", R.drawable.slovenia, "Krog", "Kokoš", "Škorenj", "Pes", 2)
        questionList.add(que10)

        return questionList
    }
}