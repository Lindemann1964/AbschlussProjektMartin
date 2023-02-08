class Flakpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                               // * KLasse G1 > G4
                                                                     // * Vererbung von Besonderheiten für FlakPz.
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Er hat eine Freund und Feind kennung")
    }
}


