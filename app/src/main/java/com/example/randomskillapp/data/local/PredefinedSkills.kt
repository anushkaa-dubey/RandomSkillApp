package com.example.randomskillapp.data.local

/**
 * 20+ predefined micro-skills. Steps are stored as plain lists here;
 * they get joined with "\n" when persisted to Room.
 */
object PredefinedSkills {

    val all: List<Skill> = listOf(
        Skill(
            title = "Learn 5 New English Words",
            description = "Expand your vocabulary by discovering 5 words you've never used before.",
            steps = listOf(
                "Open a dictionary app or Merriam-Webster online.",
                "Find 5 words you don't know.",
                "Write each word with its definition.",
                "Create a sentence for each word.",
                "Review them before sleeping."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "5-Minute Meditation",
            description = "Give your mind a short but powerful reset with guided breathing.",
            steps = listOf(
                "Find a quiet, comfortable spot.",
                "Set a 5-minute timer.",
                "Close your eyes and breathe in for 4 counts.",
                "Hold for 4 counts, exhale for 4 counts.",
                "Focus only on your breath; gently return when distracted."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Practice Typing for 10 Minutes",
            description = "Boost your typing speed and accuracy with a dedicated practice session.",
            steps = listOf(
                "Go to keybr.com or 10fastfingers.com.",
                "Warm up by typing the home-row letters.",
                "Complete two 5-minute timed tests.",
                "Note your WPM and accuracy.",
                "Identify your weakest keys and focus on them."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Write 3 Gratitude Notes",
            description = "Shift your mindset positively by reflecting on what you appreciate.",
            steps = listOf(
                "Grab a journal or open a notes app.",
                "Think of 3 specific things you're grateful for today.",
                "For each, write one sentence explaining WHY you're grateful.",
                "Read them aloud slowly.",
                "Repeat every morning this week."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn 3 Keyboard Shortcuts",
            description = "Save time and work smarter by mastering shortcuts in your daily tools.",
            steps = listOf(
                "Pick an app you use daily (browser, IDE, spreadsheet).",
                "Search '[app name] keyboard shortcuts cheatsheet'.",
                "Choose 3 shortcuts you don't use yet.",
                "Practice each shortcut 10 times intentionally.",
                "Use them naturally for the rest of the week."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Read for 15 Minutes",
            description = "Cultivate the reading habit with a focused daily session.",
            steps = listOf(
                "Choose a book or article that interests you.",
                "Put your phone on Do Not Disturb.",
                "Set a 15-minute timer and start reading.",
                "After reading, write one key takeaway.",
                "Repeat daily this week."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Do 10 Minutes of Stretching",
            description = "Relieve tension and improve flexibility with a short stretch routine.",
            steps = listOf(
                "Find an open space on the floor.",
                "Stretch your neck: tilt left-right, 10 seconds each.",
                "Shoulder rolls forward and backward, 10 reps each.",
                "Forward fold: touch your toes and hold 20 seconds.",
                "Child's pose for 30 seconds, then spinal twist each side."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Plan Your Week in 10 Minutes",
            description = "A quick weekly plan prevents overwhelm and improves focus.",
            steps = listOf(
                "Open your calendar or a blank page.",
                "List your top 3 goals for the week.",
                "Block time slots for each goal.",
                "Identify potential blockers and plan around them.",
                "Review this plan every morning."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn Basic Origami",
            description = "Fold your first origami shape and develop fine motor patience.",
            steps = listOf(
                "Get a square piece of paper.",
                "Search 'origami crane beginner' on YouTube.",
                "Follow step-by-step, pausing as needed.",
                "Try folding it twice more from memory.",
                "Teach it to someone you know."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Cook a New Healthy Recipe",
            description = "Experiment in the kitchen and learn a nutritious dish.",
            steps = listOf(
                "Search for a 20-minute healthy recipe online.",
                "Buy any missing ingredients.",
                "Follow the recipe carefully, reading all steps first.",
                "Plate it and take a photo.",
                "Rate the recipe and write what you'd change."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Practice Deep Work for 25 Minutes",
            description = "Train your focus muscle with a distraction-free Pomodoro session.",
            steps = listOf(
                "Choose one important, mentally demanding task.",
                "Close all tabs except what you need.",
                "Set a 25-minute timer (Pomodoro technique).",
                "Work with complete focus until the timer rings.",
                "Take a 5-minute break, then repeat if needed."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn One SQL Query",
            description = "Understand a new SQL concept and run it hands-on.",
            steps = listOf(
                "Open SQLFiddle or DB Fiddle online.",
                "Choose a concept: JOIN, GROUP BY, or HAVING.",
                "Read its documentation for 5 minutes.",
                "Write a query using sample data.",
                "Modify it to answer a different question."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Write a Short Story (100 words)",
            description = "Flex your creativity by crafting a tiny complete story.",
            steps = listOf(
                "Think of one character and one problem.",
                "Write the opening sentence.",
                "Describe the problem in 2-3 sentences.",
                "Write how the character resolves it.",
                "End with one closing sentence. Keep total under 100 words."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn 5 Git Commands",
            description = "Strengthen your version-control fundamentals with hands-on practice.",
            steps = listOf(
                "Open a terminal in any project folder.",
                "Practice: git status, git log --oneline, git diff.",
                "Create a test branch: git checkout -b test-branch.",
                "Commit a dummy change: git add . && git commit -m 'test'.",
                "Delete the branch: git checkout main && git branch -d test-branch."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Do 20 Push-ups",
            description = "Build upper-body strength with a simple bodyweight challenge.",
            steps = listOf(
                "Warm up with 10 arm circles each direction.",
                "Get into a high-plank position, hands shoulder-width.",
                "Lower until chest nearly touches the floor.",
                "Push back up, keeping your core tight.",
                "Complete 4 sets of 5 reps with 30 seconds rest between sets."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Practice Active Listening",
            description = "Improve your interpersonal skills by fully focusing on others.",
            steps = listOf(
                "In your next conversation, put your phone away.",
                "Maintain comfortable eye contact.",
                "Don't plan your reply while they're still talking.",
                "Ask one follow-up question based on what they said.",
                "Summarize what you heard before sharing your view."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Declutter One Drawer or Shelf",
            description = "A tidy environment reduces stress and boosts productivity.",
            steps = listOf(
                "Pick one drawer, shelf, or corner.",
                "Remove everything from it.",
                "Sort into: keep, donate, trash.",
                "Clean the space before putting things back.",
                "Only return items you genuinely use or love."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn 3 Design Principles",
            description = "Understand core visual design concepts applicable to any medium.",
            steps = listOf(
                "Search 'fundamental design principles'.",
                "Study: Contrast, Alignment, and Repetition.",
                "Find a real-world example of each.",
                "Redesign a simple UI mockup applying them.",
                "Compare your before/after and reflect."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Try a New Breathing Technique",
            description = "Discover how controlled breathing can manage stress and energy.",
            steps = listOf(
                "Research box breathing: 4-4-4-4 pattern.",
                "Sit upright in a quiet spot.",
                "Inhale 4 counts, hold 4, exhale 4, hold 4.",
                "Repeat for 5 cycles.",
                "Journal how you feel before and after."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Spend 10 Minutes in Nature",
            description = "Reconnect with the outdoors to clear your mind and refresh energy.",
            steps = listOf(
                "Step outside — yard, park, or balcony counts.",
                "Leave your phone inside or put it away.",
                "Observe 5 things you can see in nature.",
                "Listen for 3 different sounds.",
                "Take 10 slow, deep breaths of fresh air."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Learn One Regex Pattern",
            description = "Master a practical regex pattern you can reuse in real projects.",
            steps = listOf(
                "Go to regex101.com.",
                "Learn the pattern for email validation: ^[\\w.-]+@[\\w.-]+\\.\\w{2,}\$.",
                "Test it with 5 valid and 5 invalid emails.",
                "Modify it to also reject addresses shorter than 6 chars.",
                "Write a brief explanation of each part of the pattern."
            ),
            timestamp = 0L
        ),
        Skill(
            title = "Review Your Financial Goals",
            description = "Realign with your money goals and spot quick improvement areas.",
            steps = listOf(
                "List your top 3 financial goals.",
                "Check your last 7 days of spending.",
                "Identify one unnecessary expense.",
                "Set a small savings target for next week.",
                "Write one action you'll take tomorrow to move toward a goal."
            ),
            timestamp = 0L
        )
    )
}
