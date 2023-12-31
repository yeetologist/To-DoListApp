package com.dicoding.todoapp.ui.list

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers
import com.dicoding.todoapp.R
import com.dicoding.todoapp.ui.add.AddTaskActivity
import org.junit.After
import org.junit.Before
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Task (+), the AddTaskActivity displayed
class TaskActivityTest {
    @Before
    fun setup() {
        ActivityScenario.launch(TaskActivity::class.java)
        Intents.init()
    }

    @After
    fun destroy() {
        Intents.release()
    }

    @Test
    fun shouldDisplayAddTaskActivity() {
        onView(ViewMatchers.withId(R.id.fab)).perform(click())
        intended(hasComponent(AddTaskActivity::class.java.name))

    }
}