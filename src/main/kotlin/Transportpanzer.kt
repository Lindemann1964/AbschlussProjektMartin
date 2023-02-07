class Transportpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,
    var achtMann:Int
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){

}