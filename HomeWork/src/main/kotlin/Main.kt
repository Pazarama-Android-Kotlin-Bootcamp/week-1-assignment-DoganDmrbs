/* // Ödev 1
    fun CodelandUsernameValidation(str: String): String {
        return if (Regex("""^[a-zA-Z][\w]{4,25}[a-zA-Z0-9]$""").matches(str))
            "true"
        else
            "false"
}

fun main() {
    println(CodelandUsernameValidation(readLine()!!))
}
*/

/* // Ödev 2
    fun aVeryBigSum(ar: Array<Long>): Long = ar.sum()
    fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
*/

/*  // Ödev 4
fun readLn() = readLine()!!

    fun main() {
        println("Yapmak istediğiniz faktöriyel hesap sayısı: ")

        var t = readLn().toInt()
        println("Faktöriyel'ini almak istediğiniz sayıyı giriniz: ")
        repeat(t) {
            var f = 1
            var n = readLn().toInt()
            for (i in 1..n) f *= i
            println("$n Sayısının aktöriyel Sonucu: "+f)
        }
    }
*/

/* // ödev 5
 fun QuestionsMarks(str: String): String {
     val reg = """.*\?.*\?.*\?.*"""
     var i = 0
     val n = str.length
     var ans = "true"
     var gotPairs = false
     var now:Int
     var other:Int
     var therest:String
     while (i<n && ans == "true"){
         if (str[i].isDigit()){
             now = str[i].toString().toInt()
             other = 10-now
             therest = str.substring(i+1)
             if (therest.contains(other.toString())){
                 gotPairs = true
                 val regex = (reg+other.toString()).toRegex()
                 if (!regex.containsMatchIn(therest)){
                     ans = "false"
                 }
             }
         }
         i+=1
     }
     if (gotPairs==false){
         ans="false"
     }
     return ans;
 }
fun main() {
    println(QuestionsMarks(readln()))
}
*/