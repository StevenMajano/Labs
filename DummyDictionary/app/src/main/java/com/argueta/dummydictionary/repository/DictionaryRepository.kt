package com.argueta.dummydictionary.repository

import androidx.lifecycle.MutableLiveData
import com.argueta.dummydictionary.data.model.AntonymDao
import com.argueta.dummydictionary.data.model.SynonymDao
import com.argueta.dummydictionary.data.model.Word
import com.argueta.dummydictionary.data.model.WordDao

class DictionaryRepository(
    private val wordDoa: WordDao,
    val synonymDao: SynonymDao,
    val antonymDao: AntonymDao
) {

    fun getAllWords() = wordDoa.getAllWords()

    suspend fun addWord(word: Word) {
        wordDoa.insertWord(word)
    }
}