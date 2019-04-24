package com.okanaydin.androidroomcodelab.dao

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.okanaydin.androidroomcodelab.entity.Word

/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 2019-04-21 - 21:18          │
└─────────────────────────────┘
 */
class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()


    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}