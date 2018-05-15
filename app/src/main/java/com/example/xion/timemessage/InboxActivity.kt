package com.example.xion.timemessage

import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.support.v4.view.ViewPager
import android.os.Bundle


class InboxActivity : AppCompatActivity() {
    private val TAG                   = "Inbox Activity"
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)

        var tabLayout  = findViewById<TabLayout>(R.id.tabs)
        viewPager      = findViewById<ViewPager>(R.id.container)

        setupViewPager()
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setupViewPager() {
        var adapter = SectionsPageAdapter(supportFragmentManager)

        adapter.addFragment(AMsgFragment(), "オープンメッセージ")
        adapter.addFragment(UMsgFragment(), "タイムメッセージ")
        viewPager?.adapter = adapter
    }
}
