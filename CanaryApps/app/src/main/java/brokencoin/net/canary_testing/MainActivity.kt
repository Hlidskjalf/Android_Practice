package brokencoin.net.canary_testing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var age : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sum (a: Int, b:Int):Int {
        return a + b
    }

    fun helloWorld(view: View) {

    }

    fun makeThing(view: View){
        //val thingOne = Thing("Thing One", 5, "Do the first thing")

        val name = Name.text.toString()
        if (!Age.text.toString().equals("")) {
            age = Age.text.toString().toInt()
        }
        val job = Job.text.toString()
        val thingOne = Thing(name, age, job)

        textView.text = "Name: " + thingOne.name + "\n" +  "Age: " + thingOne.age + "\n" + "Job: " + thingOne.job

    }
}
