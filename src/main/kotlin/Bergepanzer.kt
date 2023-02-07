class Bergepanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,
    var auslageBruecke:Double
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen)
{

}


// *Vererbung "Schwerer Kpz, Kampf