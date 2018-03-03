package com.rajeshkantipudi.kotlinmvvm.mvvm

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.rajeshkantipudi.kotlinmvvm.Repository

/**
 * Created by rajeshkantipudi on 02/03/18.
 */
class MainViewModel : ViewModel() {
    var repoModel = RepoModel()
    //Or initialize it directly
    val isLoading = ObservableField<Boolean>(false)
    var repositories = MutableLiveData<ArrayList<Repository>>()

    fun loadRepositories() {
        isLoading.set(true)
        repoModel.getRepositories(object : OnRepositoryReadyCallback {
            override fun onDataReady(data: ArrayList<Repository>) {
                isLoading.set(false)
                repositories.value = data
            }
        })
    }
}