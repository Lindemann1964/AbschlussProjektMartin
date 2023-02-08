open class Panzer {                             //* Klasse "Panzer"
    var geschwindigkeit: Int                    //* Eigenschaften der Klasse Panzer
    var leistung: Double
    var laenge: Double
    var gewicht: Double
    var reichweite: Int
    var name: String
    var eckZeichen: String


    constructor(
        geschwindigkeit: Int,                  //* Konstruktor: Eigenschaften von A1 bis > H 4
        leistung: Double,
        laenge: Double,
        gewicht: Double,
        reichweite: Int,
        name: String,
        eckZeichen: String
    ) {
        this.geschwindigkeit = geschwindigkeit
        this.leistung = leistung
        this.laenge = laenge
        this.gewicht = gewicht
        this.reichweite = reichweite
        this.name = name
        this.eckZeichen = eckZeichen

    }

    open fun printPanzer() {
        println("Panzer:$eckZeichen")
        println(" - Name:$name")
        println("1 - Leistung:$leistung")
        println("2 - Laenge:$laenge")
        println("3 - Gewicht:$gewicht")
        println("4 - Reichweite:$reichweite")
        println("5 - Geschwindigkeit:$geschwindigkeit")
        println()


    }

    fun panzerVergleich(panzer: Panzer, eigenschaft: String): Boolean {
        when (eigenschaft) {
            "1" -> {                                   // Auswahl per Zahl in der Konsole eingeben
                println("Leistung")                    // vergleich der Leistung der beiden Panzer
                var ergebnis = leistung >= panzer.leistung
                println("Leistung")
                return ergebnis
            }

            "2" -> {                                  // Auswahl per Zahl in der Konsole eingeben
                print("Laenge")                       // vergleich Laenge der beiden Panzer
                var ergebnis = laenge >= panzer.laenge
                println("laenge")
                return ergebnis
            }

            "3" -> {                                 // Auswahl per Zahl in der Konsole eingeben
                println("Gewicht")                   // vergleich Gewicht der beiden Panzer
                var ergebnis = gewicht >= panzer.gewicht
                println("Gewicht")
                return ergebnis
            }

            "4" -> {                                 // Auswahl per Zahl in der Konsole eingeben
                print("Reichweite")                  // vergleich Reichweite der beiden Panzer
                var ergebnis = reichweite >= panzer.reichweite
                println("Reichweite")
                return ergebnis
            }

            "5" -> {                                 // Auswahl per Zahl in der Konsole eingeben
                print("Geschwindigkeit")             // vergleich Geschwindigkeit der beiden Panzer
                var ergebnis=geschwindigkeit >= panzer.geschwindigkeit
                println("Geschwindigkeit")
                return ergebnis
            }

        }
        return false

    }
}
//this ist der erste Panzer

//panzer ist der zweite Panzer

//auswahl ist ein String mit "1","2", etc...

//Die Auswahl soll erstmal ignoriert werden und es soll immer die reichweite verglichen werden ( TEST )

//Funktion soll true zurückgeben wenn der erste Panzer den Vergleich gewinnt

//Funktion soll false zurückgeben wenn Panzer 2 den Vergleich gewinnt

// Vererbung "Schwerer Kpz, Kampf Pz, SpähPz, SchützenPz, BergePz, JagdPz, FlakPz, PanzerHbz, TransportPz....//

// Diagramm erstellen



