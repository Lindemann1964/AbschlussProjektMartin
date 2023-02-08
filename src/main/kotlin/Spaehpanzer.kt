class Spaehpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                            //* Klasse F1 > F4
    var text:String                                                     //* Vererbung von Besonderheiten für SpPz.
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Er kann getarnt Spähen")
    }


}