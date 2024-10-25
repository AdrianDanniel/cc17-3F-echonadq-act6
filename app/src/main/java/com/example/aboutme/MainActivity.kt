package com.example.about

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aboutme.adapter.AboutMeAdapter
import com.example.aboutme.model.AboutMe


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)


        val day1 = AboutMe(R.drawable.Day1,
            "Set Clear Goals",
            "Define specific, achievable fitness goals (e.g., lose 5 lbs, gain muscle, run 5K).",
            "Day 1")

        val day2 = AboutMe(R.drawable.Day2,
            "Start with Warm-ups",
            "Begin every workout with a dynamic warm-up (e.g., jumping jacks, leg swings) to prevent injury..\n",
            "Day 2")

        val day3 = AboutMe(R.drawable.Day3,
            "Focus on Form",
            "Learn the proper form for basic exercises (e.g., squats, push-ups). Proper technique is key to progress.",
            "Day 3")

        val day4 = AboutMe(R.drawable.Day4,
            "Hydrate",
            "Aim to drink 8–10 glasses of water a day. Hydration supports performance and recovery..",
            "Day 4")

        val day5 = AboutMe(R.drawable.Day5,
            "Begin Strength Training",
            "Start with bodyweight exercises like squats, lunges, and planks to build strength..",
            "Day 5")

        val day6 = AboutMe(R.drawable.Day6,
            "Try Low-Impact Cardio",
            "Go for a brisk walk, swim, or bike ride to get your heart rate up without straining joints.",
            "Day 6")

        val day7 = AboutMe(R.drawable.Day7,
            "Rest and Recover",
            "Rest is essential. Use this day for light stretching or yoga to improve flexibility.",
            "Day 7")

        val day8 = AboutMe(R.drawable.Day8,
            "Add Weights",
            "Incorporate light weights or resistance bands into your strength workouts.",
            "Day 8")

        val day9 = AboutMe(R.drawable.Day9,
            "Incorporate Interval Training",
            "Try high-intensity interval training (HIIT) to burn fat efficiently.",
            "Day 9")

        val day10 = AboutMe(R.drawable.Day10,
            "Track Your Progress",
            "Measure progress with a fitness app or journal (track weight, strength gains, and endurance).",
            "Day 10")

        val day11 = AboutMe(R.drawable.Day11,
            " Focus on Core Strength",
            "Add exercises like planks, Russian twists, and leg raises for core stability.",
            "Day 11")

        val day12 = AboutMe(R.drawable.Day12,
            "Eat Protein-Rich Meals",
            "Ensure your diet includes lean proteins (chicken, tofu, eggs) to aid muscle repair.",
            "Day 12")

        val day13 = AboutMe(R.drawable.Day13,
            "Prioritize Sleep",
            "Get 7–9 hours of sleep to enhance muscle recovery and energy levels.",
            "Day 13")

        val day14 = AboutMe(R.drawable.Day14,
            "Stretch More",
            "Incorporate stretching into your routine to increase flexibility and prevent soreness.",
            "Day 14")

        val day15 = AboutMe(R.drawable.Day15,
            "Combine Strength and Cardio",
            "Alternate between strength and cardio exercises in a circuit workout.",
            "Day 15")

        val day16 = AboutMe(R.drawable.Day16,
            "Try a New Activity",
            "Switch things up with a new workout like kickboxing, dance, or rowing to keep it fun.",
            "Day 16")

        val day17 = AboutMe(R.drawable.Day17,
            "Meal Prep",
            "Plan and prepare healthy meals ahead to stay consistent with your nutrition.",
            "Day 17")

        val day18 = AboutMe(R.drawable.Day18,
            "Add Plyometrics",
            "Integrate jumping exercises (e.g., box jumps, burpees) to increase power and agility.",
            "Day 18")

        val day19 = AboutMe(R.drawable.Day19,
            "Take Active Breaks",
            "Incorporate movement into your day, even outside workouts (e.g., walk during lunch).",
            "Day 19")

        val day20 = AboutMe(R.drawable.Day20,
            "Focus on Upper Body",
            "Do push-ups, dumbbell presses, and rows to strengthen your chest, back, and arms.",
            "Day 20")

        val day21 = AboutMe(R.drawable.Day21,
            "Schedule Workouts",
            "Plan your workouts ahead and treat them as non-negotiable appointments.",
            "Day 21")

        val day22 = AboutMe(R.drawable.Day22,
            "Increase Resistance",
            "Challenge yourself by gradually increasing the weights you lift or resistance bands you use.",
            "Day 22")

        val day23 = AboutMe(R.drawable.Day23,
            "Sprint Training",
            "Incorporate sprint intervals into your cardio sessions to boost metabolism.",
            "Day 23")

        val day24 = AboutMe(R.drawable.Day24,
            "Listen to Your Body",
            "Take rest days when needed and adjust your workouts if you feel pain or discomfort.",
            "Day 24")

        val day25 = AboutMe(R.drawable.Day25,
            "Strengthen Lower Body",
            "Focus on legs with squats, lunges, deadlifts, and calf raises.",
            "Day 25")

        val day26 = AboutMe(R.drawable.Day26,
            "Eat Clean Carbs",
            "Include whole grains, fruits, and veggies to fuel your workouts and improve recovery.",
            "Day 26")

        val day27 = AboutMe(R.drawable.Day27,
            "Meditate or Practice Mindfulness",
            "Relax your mind with meditation to reduce stress and support mental health.",
            "Day 27")

        val day28 = AboutMe(R.drawable.Day28,
            "Track Calories and Macronutrients",
            " Monitor what you eat to ensure you’re getting the right fuel for your goals.",
            "Day 28")

        val day29 = AboutMe(R.drawable.Day29,
            "Cool Down Properly",
            "Always end your workout with a cool-down and stretching to promote flexibility and recovery.",
            "Day 29")

        val day30 = AboutMe(R.drawable.Day30,
            "Reflect on Progress",
            "Assess how far you've come, celebrate your success, and set new fitness goals!",
            "Day 30")



        val arrList = listOf(day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21, day22, day23, day24, day25, day26, day27, day28, day29, day30)



        rvAboutMe.adapter = AboutMeAdapter(arrList)
    }
}