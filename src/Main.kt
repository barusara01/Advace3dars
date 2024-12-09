import com.google.gson.Gson


data class Gsonclasss(
    val id:Int=1,
    val name:String="Leanne Grahm",
    val username:String="Bret",
    val eamil:String="Sincere@april.biz",
    val phone:String="1-770-736-8031 x56442",
    val websity:String="hildegarng.org"
)

fun main(args: Array<String>) {
    val gsone=Gson()
    val gsoni=Gsonclasss()
    val gsonstr=gsone.toJson(gsoni)
    println(gsonstr)

    val gsonString = "{\"id\":1,\"name\":\"Leanne Grahm\",\"username\":\"Bret\",\"eamil\":\"Sincere@april.biz\",\"phone\":\"1-770-736-8031 x56442\",\"websity\":\"hildegarng.org\"}"
    val user = gsone.fromJson<Gsonclasss>(gsonString, Gsonclasss::class.java)
    println(user.name)
}

