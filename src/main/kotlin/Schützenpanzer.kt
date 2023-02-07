class Schützenpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,
    var kanone76mm:Int
) : Panzer(geschwindigkeit, leistung, laenge, gewicht, reichweite, name, eckZeichen){

}