class Jagdpanzer(
    geschwindigkeit: Int,
    leistung: Double,
    laenge: Double,
    gewicht: Double,
    reichweite: Int,
    name: String,
    eckZeichen: String,                                              //* Klasse F1 > F4
    var kurzStrekenRaketen:String                                    //* Vererbung von Besonderheiten für JgPz
) : Panzer(geschwindigkeit,leistung,laenge,gewicht,reichweite,name,eckZeichen){

}