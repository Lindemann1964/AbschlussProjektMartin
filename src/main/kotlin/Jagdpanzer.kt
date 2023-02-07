class Jagdpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,
    var kurzStrekenRaketen:String
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){

}