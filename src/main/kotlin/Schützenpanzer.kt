class Schützenpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                                   // * D1 > D4
    var text:String                                                            // * Vererbung von Besonderheiten für SPz.
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Der hintere Kampfraum kann absitzen")
    }
}