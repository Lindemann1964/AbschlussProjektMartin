class SchwererKampfpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                                  // * Klasse A1 > A4
                                                                         // * Vererbung von Besonderheiten für SKpz.
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Er verschießt denkende Munition")
    }




}



