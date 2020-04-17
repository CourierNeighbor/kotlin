fun max0f(a: Int, b: Int): 
Int{
    if(a > b)
    {
        return a
    }
    else
    {
        return b
    }
}

fun main()
{
    println("max of 0 and 42 is ${max0f(0, 42)}")
}