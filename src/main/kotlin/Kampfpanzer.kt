import org.w3c.dom.Text

class Kampfpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                                    // * Klasse B1 > B4
    var text: String                                                           // * Vererbung von Besonderheiten für KfPz.
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){
    override fun printPanzer() {
        super.printPanzer()
        println("Für ein Kampfpanzer ist er schnell und wendig")
    }

}