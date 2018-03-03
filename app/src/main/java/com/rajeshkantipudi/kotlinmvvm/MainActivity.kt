package com.rajeshkantipudi.kotlinmvvm

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rajeshkantipudi.kotlinmvvm.databinding.ActivityMainBinding

//MainActivity : AppCompatActivity() means that we are extending AppCompatActivity
class MainActivity : AppCompatActivity() {

    //lateinit modifier allows us to have non-null variables waiting for initialization
    lateinit var binding: ActivityMainBinding


    //all methods have to have a fun word and in Kotlin you don’t have to use ;
    //but you can if you like. You have to use override word and not an annotation.
    override fun onCreate(savedInstanceState: Bundle?) { //? It means that savedInstanceState parameter can be Bundle type or null
        // must be initialized
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //How to use Apply
        //apply allows you to call multiple methods on one instance.
        binding.apply {
            repositoryName.text = "Rajesh"
        }

        //no new keyword for object construction
        val repository = Repository("Medium Android Repository Article",
                "Fleka", 1000, true)

        binding.repoItem = repository
        binding.executePendingBindings()

        /* Handler().postDelayed({repository.repositoryName="New Name"
             binding.repository = repository
             binding.executePendingBindings()}, 2000)

             We should Use property observer to observe changes
             */


        /*val repository1 = RepositoryObservable(
                "Fleka", 1000, true)
        repository1.repositoryName = "Test"

        binding.repoItem = repository1*/

    }
}


//Documentation:
//Nullable
//nameTextView?.setEnabled(true)     - > proceeded only if nameTextView is not a null
//nameTextView!!.setEnabled(true)    - > it will give us NPE if nameTextView is a null

//Getters and Setters are not available in Kotlin
