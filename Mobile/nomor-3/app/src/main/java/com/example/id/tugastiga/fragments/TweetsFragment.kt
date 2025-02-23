package com.example.id.tugastiga.fragments

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.id.tugastiga.R

class TweetsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tweets, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val txtTweet: TextView = view.findViewById(R.id.txt_tweet)

        val tweetText =
            "This is Fates Forever, a MOBA developed by @jasoncitron & @svishevnskiy that would lay the foundations for @discord. So how did they go from multiplayer games to a chat app that was meant for gamers but has revolutionized how people communicate online?"
        val spannable = SpannableString(tweetText)

        val pattern = Regex("(@\\w+|#\\w+)")
        pattern.findAll(tweetText).forEach {
            spannable.setSpan(
                ForegroundColorSpan(Color.parseColor("#00BCD4")),
                it.range.first,
                it.range.last + 1,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }

        txtTweet.text = spannable
    }
}
