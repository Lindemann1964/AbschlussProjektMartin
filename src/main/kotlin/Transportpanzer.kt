class Transportpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                                       //* Klasse F1 > F4
    var besatzung: Int                                                         //* Vererbung von Besonderheiten für TPz.
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen) {
    override fun printPanzer() {
        super.printPanzer()
        println("Die Besatzung besteht aus$besatzung Soldaten")

    }
}
