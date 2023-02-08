fun main() {                               // Liste der Panzer und Kategorien //
    var a1: SchwererKampfpanzer = SchwererKampfpanzer(72, 1100.0, 10.97, 67.50, 450, "Leopard2A6", "a1",)   //🇩🇪
    var a2: SchwererKampfpanzer = SchwererKampfpanzer(65, 1103.0, 9.82, 69.50, 480, "AbrahamsM1A2", "a2")  //🇺🇸
    var a3: SchwererKampfpanzer = SchwererKampfpanzer(56, 882.0, 9.86, 62.50, 380, "Challenger2", "a3")    //🇬🇧
    var a4: SchwererKampfpanzer = SchwererKampfpanzer(60, 575.0, 6.67, 41.00, 480, "T72M", "a4")           //🇷🇺

    var b1: Kampfpanzer = Kampfpanzer(72, 1103.0, 10.90, 65.70, 450, "Leopard2A7+", "b1","Für ein Kampfpanzer ist er schnell und wendig") //🇩🇪
    var b2: Kampfpanzer = Kampfpanzer(72, 1103.0, 9.78, 56.50, 550, "Leclerk MBT", "b2","Für ein Kampfpanzer ist er schnell und wendig")  //🇫🇷
    var b3: Kampfpanzer = Kampfpanzer(65, 530.0, 6.80, 36.0, 600, "AMX 30", "b3","Für ein Kampfpanzer ist er schnell und wendig")         //🇺🇸
    var b4: Kampfpanzer = Kampfpanzer(65, 882.0, 9.67, 53.20, 500, "K1A1", "b4","Für ein Kampfpanzer ist er schnell und wendig")          //🇰🇷

    var c1: Spaehpanzer = Spaehpanzer(70, 158.0, 4.60, 8.50, 523, "Lynx", "c1","Er kann getarnt Spähen")      //🇭🇺
    var c2: Spaehpanzer = Spaehpanzer(60, 530.0, 10.30, 31.50, 500, "Donar", "c2","Er kann getarnt Spähen")   //🇩🇪
    var c3: Spaehpanzer = Spaehpanzer(81, 140.0, 4.38, 8.00, 644, "Scorpion", "c3","Er kann getarnt Spähen")  //🇬🇧
    var c4: Spaehpanzer = Spaehpanzer(66, 202.0, 5.30, 12.10, 480, "M113A3", "c4","Er kann getarnt Spähen")   //🇺🇸

    var d1: Schützenpanzer = Schützenpanzer(61, 441.0, 6.55, 34.25, 402, "Bradley A3", "d1","Der hintere Kampfraum kann absitzen")     //🇺🇸
    var d2: Schützenpanzer = Schützenpanzer(80, 221.0, 6.74, 13.50, 500, "BMP1", "d2","Der hintere Kampfraum kann absitzen")           //🇷🇺
    var d3: Schützenpanzer= Schützenpanzer(70, 800.0, 7.60, 31.50, 600, "Puma", "d3","Der hintere Kampfraum kann absitzen")            //🇩🇪
    var d4: Schützenpanzer =Schützenpanzer(75, 590.0, 6.90, 27.00, 900, "CV90 Armadillo", "d4","Der hintere Kampfraum kann absitzen")  //🇺🇸

    var e1: Bergepanzer= Bergepanzer(72, 1100.0, 9.15, 59.00, 500, "DNG", "e1")           //🇫🇷
    var e2: Bergepanzer= Bergepanzer(42, 537.0, 13.74, 53.30, 320, "Chieftain", "e2")     //🇺🇸
    var e3: Bergepanzer= Bergepanzer(60, 313.0, 6.40, 22.00, 900, "M 578", "e3")          //🇺🇸
    var e4: Bergepanzer= Bergepanzer(62, 610.0, 11.40, 45.10, 450, "Bieber", "e4")
    var f1: Transportpanzer = Transportpanzer(68, 221.0, 7.76, 17.50, 520, "Kürassier", "f1",3)           //🇦🇹
    var f2: Transportpanzer = Transportpanzer(103, 520.0, 7.90, 33.00, 1050, "Boxer", "f2",10)            //🇩🇪
    var f3: Transportpanzer = Transportpanzer(58, 160.0, 4.90, 15.80, 480, "ADATS", "f3",7)
    var f4: Transportpanzer = Transportpanzer(105, 335.0, 7.36, 24.00, 700, "Pandur 8x8", "f4",8)         //🇦🇹

    var g1: Flakpanzer=Flakpanzer(70, 440.0, 6.93, 32.50, 540, "1 Roland", "g1")         //🇩🇪
    var g2: Flakpanzer=Flakpanzer(65, 610.0, 7.68, 47.50, 550, "Gepard", "g2",)           //🇩🇪
    var g3: Flakpanzer=Flakpanzer(100, 382.0, 7.95, 30.10, 800, "Draco", "g3")           //🇮🇹
    var g4: Flakpanzer=Flakpanzer(61, 158.0, 6.09, 12.60, 504, "M730 Chaparrral", "g4")  //🇺🇸

    var h1: Panzerhaubitze=Panzerhaubitze(64, 368.0, 6.83, 24.60, 480, "480MLRS", "h1",)
    var h2: Panzerhaubitze=Panzerhaubitze(61, 746.0, 7.90, 55.00, 420, "PzH 2000", "h2",)
    var h3: Panzerhaubitze=Panzerhaubitze(65, 294.0, 6.38, 18.50, 490, "ACV-SSPM120", "h3")
    var h4: Panzerhaubitze=Panzerhaubitze(60, 441.0, 9.70, 35.38, 322, "M109A6 PIM", "h4",)


    var list = mutableListOf<Panzer>(
        a1,
        a2,
        a3,
        a4,
        b1,
        b2,
        b3,
        b4,
        c1,
        c2,
        c3,
        c4,
        d1,
        d2,
        d3,
        d4,
        e1,
        e2,
        e3,
        e4,
        f1,
        f2,
        f3,
        f4,
        g1,
        g2,
        g3,
        g4,
        h1,
        h2,
        h3,
        h4
    )
    list.shuffle()
    var spielerListe = list.slice(0..15).toMutableList()
    var computerListe = list.slice(16..31).toMutableList()

    println(spielerListe.size)
    println(computerListe.size)
    while (spielerListe.size > 0 && computerListe.size > 0) {                  // Karten mischen und verteilen 16 *Spieler - !6* Computer

                                                                               // bis eine Liste vom Spieler leer ist !! ein Schleifendurchlauf ist eine Runde!!

        var spielerPanzer = spielerListe.first()
        var computerPanzer = computerListe.first()
        spielerPanzer.printPanzer()

        println("Triff die Auswahln deiner Eigenschaften!")
        var eigenschaft = readln()
        computerPanzer.printPanzer()
        var gewonnen= spielerPanzer.panzerVergleich(computerPanzer,eigenschaft) // vergleich der Eigenschaft SP und CoP
        if (gewonnen){
            println("Du hast gewonnen")
            spielerListe.add(computerPanzer)
            spielerListe.add(spielerPanzer)
            spielerListe.removeAt(0)
            computerListe.removeAt(0)


        }
        else{
            println("Du hast verloren")
            computerListe.add(spielerPanzer)
            computerListe.add(computerPanzer)
            spielerListe.removeAt(0)
            computerListe.removeAt(0)
        }
Thread.sleep(3000)                                                         // 3 Sec. Zeitverzögerung ein gebaut


                                                                                 // computerPanzer.panzerVergleich(spielerPanzer,eigenschaft)
                                                                                 // vergleich der Eigenschaft CoP und SP



    }
}



// Name Kategorie auswählen (Konsole) Quartett besteht aus 32 Karten aus Panzern der NATO und dem Ausland
// vergleich anhand einer Kategorie
// Eckzeichen vergleich anhand Buchstabe=String-oderZahl= Integer
// Karten werden zu gleichen Teilen verteilt
//


                                         // Spielvariante //
// *  🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪 Quartett TRUMPFEN  🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪🇩🇪

      // * Die Karten werden gut gemischt und reihum gleichmäßig verteilt. Die Spieler ihre Karten hinter-
      // * einander als Stapel in der Hand, so dass immer nur die oberste Karte zu sehen ist.
      // * Ein Spieler beginnt und liest den Titel der Obersten Karte sowie eine Kategorie und den Wert seiner
      // * Wahl laut vor. Die oder der Spieler vergleichen diesen Wert mit der eigenen obersten Karte - der höchste
      // * Wert gewinnt. Der Gewinner bekommt den Stich und beginnt somit die nächste Runde.
      // * Bei gleichen Werten entscheidet das Eckzeichen auf der Karte - zuerst der höhere Buchstabe und dann die
      // * Zahl. D ist höher als A, 4 ist höher als 1. Bei zwei gleichen Buchstaben ist also die Ziffer
      // * ausschlggebend, C4 ist höher als C1.
      // *🏁🏁🏁🏁🏁  Sieger des Spieles ist, wer die meisten Karten für sich gewinnen konnte.  🏁🏁🏁🏁🏁
// *                   🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁
// *  🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁//Soielvariante 2 // 🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁🏁
      // *Zunächst werden die Karten gut gemischt und reihum Gleichmässig verteilt.
      // *Die Spieler halten Ihre Karten hintereinander im Stapel in der Hand, so das immer nur die oberste
      // *Karte zu sehen ist. Ein Spieler beginnt den Titel sowie einer Kategorie und den Wert seiner wahl laut vor
      // *Die anderen Spieler vergleichen den Wert mit der eigenen obersten Karte - der höchste Wert gewinnt
      // *Der Gewinner gewinnt den Stich