package com.rajeshkantipudi.kotlinmvvm.mvvm

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.rajeshkantipudi.kotlinmvvm.R
import com.rajeshkantipudi.kotlinmvvm.databinding.ActivityMain2Binding

/**
 * Created by rajeshkantipudi on 02/03/18.
 */
class MainActivity2 : AppCompatActivity(), RepositoryRecyclerViewAdapter.OnItemClickListener {

    lateinit var binding: ActivityMain2Binding
    private val repositoryRecyclerViewAdapter = RepositoryRecyclerViewAdapter(arrayListOf(), this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        binding.executePendingBindings()

        binding.repositoryRv.layoutManager = LinearLayoutManager(this)
        binding.repositoryRv.adapter = repositoryRecyclerViewAdapter

        viewModel.repositories.observe(this, Observer { it?.let {
            repositoryRecyclerViewAdapter.replaceData(it)
        } })

    }

    override fun onItemClick(position: Int) {
        TODO("not implemented")
    }

}