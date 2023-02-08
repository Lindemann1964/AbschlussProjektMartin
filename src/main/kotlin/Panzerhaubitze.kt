class Panzerhaubitze(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                                    // * Klasse H1 > H4
                                                                           // * Vererbung von Besonderheiten für PzH
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Wird automatisch Geladen")
    }

}