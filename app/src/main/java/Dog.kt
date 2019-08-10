class dog{
    var name: String
    var age: Int

    constructor(){
        this.name: = ""
        this.age = 0
    }
    fun say(){
        Log.d("kotlintest",this.name+ "(" + this.age+"歳)" + "「ワンワン」")
    }
}