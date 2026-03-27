package com.example.randomskillapp.utils

import android.content.Context
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.randomskillapp.worker.WeeklySkillWorker
import java.util.concurrent.TimeUnit

object WorkManagerHelper {

    private const val WORK_NAME = "weekly_skill_notification"

    fun scheduleWeeklyNotification(context: Context) {
        val request = PeriodicWorkRequestBuilder<WeeklySkillWorker>(7, TimeUnit.DAYS)
            .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            WORK_NAME,
            ExistingPeriodicWorkPolicy.KEEP,   // don't restart if it already exists
            request
        )
    }
}
