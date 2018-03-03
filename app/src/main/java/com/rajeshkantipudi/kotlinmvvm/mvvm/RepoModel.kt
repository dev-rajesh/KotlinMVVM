package com.rajeshkantipudi.kotlinmvvm.mvvm

import android.os.Handler
import com.rajeshkantipudi.kotlinmvvm.Repository

/**
 * Created by rajeshkantipudi on 02/03/18.
 */
class RepoModel {

    fun getRepositories(onRepositoryReadyCallback: OnRepositoryReadyCallback) {
        val arrayList = ArrayList<Repository>()
        arrayList.add(Repository("First", "Owner 1", 100, false))
        arrayList.add(Repository("Second", "Owner 2", 30, true))
        arrayList.add(Repository("Third", "Owner 3", 430, false))

        Handler().postDelayed({ onRepositoryReadyCallback.onDataReady(arrayList) }, 2000)
    }
}

interface OnRepositoryReadyCallback {
    fun onDataReady(data: ArrayList<Repository>)
}