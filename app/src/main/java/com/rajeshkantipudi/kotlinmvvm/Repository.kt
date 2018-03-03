package com.rajeshkantipudi.kotlinmvvm

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by rajeshkantipudi on 02/03/18.
 */

//In Kotlin, the primary constructor is a part of a class header.
//If you don’t want to provide the second constructor, that’s it!
class Repository(var repositoryName: String?,
                 var repositoryOwner: String?,
                 var numberOfStars: Int?,
                 var hasIssues: Boolean = false)


//class RepositoryObservable(
//        var repositoryOwner: String?,
//        var numberOfStars: Int?,
//        var hasIssues: Boolean = false) : BaseObservable() {
//
//    @get:Bindable
//    var repositoryName: String = ""
//        set(value) {
//            field = value
//            notifyPropertyChanged(BR.repositoryName)
//        }
//}