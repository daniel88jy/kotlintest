package com.example.kotlintest

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CombinationAdapter : BaseAdapter {
    var mContext: Context
    var mCombinationList: ArrayList<ICombination>

    constructor(context: Context, combinationList: ArrayList<ICombination>) {
        mContext = context
        mCombinationList = combinationList
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return mCombinationList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}