package com.thatbritishchap.britishwordoftheday.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object BritishContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
//        for (i in 1..COUNT) {
//            addItem(createDummyItem(i))
//        }
        myFirstItem()

    }

    private fun myFirstItem() {
        val id = "1"
        val britWord: String = "banjaxed"
        val britDescription: String = "Adjective\n" +
                "banjaxed (comparative more banjaxed, superlative most banjaxed)\n" +
                "\n" +
                "(Britain and Ireland, slang) Broken, ruined, shattered; confounded. \n" +
                "(Britain and Ireland, slang) Tired, sleepy, cream crackered.\n" +
                "I'm completely banjaxed!"
        val item = DummyItem(id, britWord, britDescription)
        ITEMS.add(item)
        ITEM_MAP[id] = item
    }


    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put("abc",DummyItem("a","b","c"))
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}
