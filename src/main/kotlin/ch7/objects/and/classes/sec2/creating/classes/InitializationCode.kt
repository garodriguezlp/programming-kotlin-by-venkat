package ch7.objects.and.classes.sec2.creating.classes

class Foo(val iAmAProperty: String, iAmAParameter : String) {

    init {
        println("iAmAParameter: $iAmAParameter")
    }

    init {
        println("iAmAProperty: $iAmAProperty")
    }

    fun doSomething() {
        println("I am a function that can use the iAmAProperty '$iAmAProperty' and can't use iAmAParameter")
    }

    init {
        println("I am the last init block, and still can use the iAmAProperty '$iAmAProperty' and I can still use iAmAParameter '$iAmAParameter'")
    }
}

fun main(args: Array<String>) {
    val foo = Foo("I am a property", "I am a parameter")
    println(foo.iAmAProperty)
}
