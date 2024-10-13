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


        val day1 = AboutMe(R.drawable.d1,
            "Set Time Limits for Gaming",
            "While gaming marathons can be fun, setting time limits helps avoid fatigue. Aim for 1-2 hour sessions with breaks in between. It keeps you refreshed and prevents burnout.",
            "day 1")

        val day2 = AboutMe(R.drawable.d2,
            "Join an Anime Club",
            "Find or create an anime club at school, locally, or online. Sharing your passion with fellow fans adds a social element and opens you up to new recommendations and experiences.\n",
            "day 2")

        val day3 = AboutMe(R.drawable.d3,
            "Budget for Gacha Spending",
            "It's easy to get carried away with gacha games. Create a monthly budget for in-game purchases, focusing on saving for special events where you have a better chance at rare items.",
            "day 3")

        val day4 = AboutMe(R.drawable.d4,
            "Watch One Episode a Day",
            "Stay consistent with your favorite series by dedicating a bit of time daily. Even if it's just one episode, it keeps you connected and up-to-date without taking up too much of your day.",
            "day 4")

        val day5 = AboutMe(R.drawable.d5,
            "Read Manga",
            "Instead of scrolling through social media, wind down by reading a chapter or two of manga. It's a relaxing way to end the day while enjoying your favorite stories.",
            "day 5")

        val day6 = AboutMe(R.drawable.d6,
            "Organize Your Collection",
            "Take pride in your figures, manga, and posters by organizing them. Clean up your shelf or display area, and it might even reignite your love for some old favorites.",
            "day 6")

        val day7 = AboutMe(R.drawable.d7,
            "Try a New Genre",
            "Expand your horizons by exploring anime genres you haven't seen before, like sports, psychological, or slice-of-life. You might discover a new favorite!",
            "day 7")

        val day8 = AboutMe(R.drawable.d8,
            "Game and Anime Balance",
            "To avoid burnout, alternate your focus between gaming and anime. For example, watch anime one day and dedicate the next to gaming. It keeps both hobbies fresh and exciting.",
            "day 8")

        val day9 = AboutMe(R.drawable.d9,
            "Create an Otaku Budget",
            "Besides gacha, set aside a budget for other hobbies like figures, manga, or conventions. It helps keep spending in check while allowing you to enjoy your passions.",
            "day 9")

        val day10 = AboutMe(R.drawable.d10,
            "Use Gacha Only for Favorite Characters",
            "Resist the urge to pull on every banner. Save your currency for events with higher chances of getting characters or items you really want.",
            "day 10")

        val day11 = AboutMe(R.drawable.d11,
            "Attend Anime Conventions",
            "If possible, go to at least one convention this year. They offer an amazing experience with other fans, exclusive merch, and opportunities to meet voice actors or artists.",
            "day 11")

        val day12 = AboutMe(R.drawable.d12,
            "Practice Drawing Fan Art",
            "Even if you’re not confident in your drawing skills, try sketching your favorite characters. It’s a fun way to get creative and express your fandom.",
            "day 12")

        val day13 = AboutMe(R.drawable.d13,
            "Touch Grass",
            "Go outside for a while and get some fresh air. Even if it’s just a short walk, it helps reset your mind and body after long gaming or anime-watching sessions.",
            "day 13")

        val day14 = AboutMe(R.drawable.d14,
            "Set Daily Achievement Goals in Games",
            "Pick a game you enjoy and set daily goals, like completing a specific quest or leveling up a character. It adds a sense of accomplishment to your gaming sessions.",
            "day 14")

        val day15 = AboutMe(R.drawable.d15,
            "Create a Watch List",
            "Compile a list of anime or manga you plan to watch/read next. It helps you stay organized and ensures you always have something new lined up.",
            "day 15")

        val day16 = AboutMe(R.drawable.d16,
            "Do Gacha Dailies",
            "Make sure to log in and complete your daily tasks in your favorite gacha games to maximize rewards and get closer to that next big pull.",
            "day 16")

        val day17 = AboutMe(R.drawable.d17,
            "Try Cosplaying a Character",
            "Even if you don’t plan to wear it publicly, try cosplaying a favorite character at home. It’s a fun way to connect with the character on a different level.",
            "day 17")

        val day18 = AboutMe(R.drawable.d18,
            "Host/Join an Anime Watch Party",
            "Invite friends over or organize an online watch party where you can stream your favorite anime together. Sharing the experience makes it more memorable.",
            "day 18")

        val day19 = AboutMe(R.drawable.d19,
            "Customize Your Devices with Anime Themes",
            "Set up your phone, laptop, or gaming console with wallpapers, icons, and sounds inspired by your favorite anime or game. It adds a personal touch and makes using your devices more enjoyable.",
            "day 19")

        val day20 = AboutMe(R.drawable.d20,
            "Participate in Online Anime Discussions",
            "Engage in Reddit threads, forums, or social media to discuss the latest episodes or speculate about upcoming chapters. It’s a good way to connect with other fans.\n",
            "day 20")

        val day21 = AboutMe(R.drawable.d21,
            "Create a Gacha Wish List",
            "List the characters or items you want most. Having a wish list helps you prioritize and save up for specific banners.",
            "day 21")

        val day22 = AboutMe(R.drawable.d22,
            "Learn Some Japanese Phrases",
            "Pick up basic Japanese phrases, especially those you hear often in anime or games. It makes the experience more enjoyable and could be useful for future travels.",
            "day 22")

        val day23 = AboutMe(R.drawable.d23,
            "Try Out Voice Acting",
            "Practice mimicking your favorite characters’ voices or create your own unique takes. It’s a fun hobby that can improve your voice control and expression.",
            "day 23")

        val day24 = AboutMe(R.drawable.d24,
            "Limit Screen Time Before Bed",
            "Avoid staring at screens right before bed to get better sleep. Instead, read a manga or listen to a podcast about anime.",
            "day 24")

        val day25 = AboutMe(R.drawable.d25,
            "Explore Light Novels",
            "Many anime originate from light novels, which often contain more detailed storytelling. If you loved the anime, reading the light novel can give you a deeper understanding.",
            "day 25")

        val day26 = AboutMe(R.drawable.d26,
            "Follow Your Favorite Creators on Social Media",
            "Stay updated with what your favorite voice actors, artists, and writers are up to. Many share behind-the-scenes content that fans find fascinating.",
            "day 26")

        val day27 = AboutMe(R.drawable.d27,
            "Start a Monthly Anime Challenge",
            "Challenge yourself to watch a new anime series or complete a manga each month. It keeps things exciting and helps you discover hidden gems or classics you might’ve missed.",
            "day 27")

        val day28 = AboutMe(R.drawable.d28,
            "Share Your Gacha Results with Friends",
            "Discuss your gacha pulls with fellow players. Even if your luck isn’t great, sharing the experience makes it more fun.",
            "day 28")

        val day29 = AboutMe(R.drawable.d29,
            "Try Out an Anime-Based Game",
            "Explore games based on your favorite anime. They can add depth to the story, give you a new way to interact with beloved characters, and provide extra content.",
            "day 29")

        val day30 = AboutMe(R.drawable.d30,
            "Reflect on Your Otaku Journey",
            "Think about the anime you've watched, manga you’ve read, and games you’ve played. Set some goals for what you want to explore or revisit next month.",
            "day 30")



        val arrList = listOf(day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21, day22, day23, day24, day25, day26, day27, day28, day29, day30)



        rvAboutMe.adapter = AboutMeAdapter(arrList)
    }
}