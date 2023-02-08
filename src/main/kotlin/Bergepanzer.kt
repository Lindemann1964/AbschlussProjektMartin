class Bergepanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                               // * Klasse E1 > E4
                                                                      // * Vererbung von Besonderheiten für FlakPz.
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen)
{
    override fun printPanzer() {
        super.printPanzer()
        println("Der Panzer kann eine Brücke verlegen")
    }

}


// *Vererbung "Schwerer Kpz, Kampf