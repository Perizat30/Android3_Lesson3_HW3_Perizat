package com.example.android3_lesson3_hw3_perizat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private ArrayList<Book>  arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }

    private void findViews() {
        recyclerView= findViewById(R.id.recycler_view_book);
    }
    private void fillList(){
        arrayList=new ArrayList<>();
        arrayList.add(new Book("Rich Dad Poor Dad by Robert Kiyosaki",
                "Robert Kiyosaki’s Rich Dad Poor Dad has become the" +
                        " top personal finance book of all time." +
                        " Kiyosaki shares the story of growing up with two " +
                        "fatherly influences — his own and his close friend’s" +
                        " “rich dad.”",R.drawable.first));
        arrayList.add(new Book("Shoe Dog by Phil Knight",
                "Nike might be a global icon today, but it took a lot of hard work to get" +
                        " it there. In his book Shoe Dog, Nike co-founder Phil Knight talks about " +
                        "launching his startup after business school with $50 he borrowed from a " +
                        "friend.", R.drawable.second));
        arrayList.add(new Book("The Hard Thing About Hard Things by Ben Horowitz",
                "Ben Horowitz is one of the most respected entrepreneurs in Silicon " +
                        "Valley. In The Hard Thing About Hard Things, Horowitz pulls back the " +
                        "curtain to reveal the truth about what it’s like to lead a successful " +
                        "business through challenging times.",R.drawable.third));
        arrayList.add(new Book("Deep Work by Cal Newport",
                "Professor Cal Newport teaches computer science at Georgetown University." +
                        " He coined the term “deep work” and explains how modern business perks like " +
                        "open offices and distractions such as social media get in the way of " +
                        "high-quality work.",R.drawable.fourth));
        arrayList.add(new Book("How to Win Friends and Influence People by Dale Carnegie",
                "Dale Carnegie’s New York Times bestseller How to Win Friends and " +
                        "Influence People has sold over 30 million copies worldwide since first" +
                        " published in 1936. Despite being the oldest book on the list, it’s one " +
                        "of the most well-known business books ever written. Carnegie’s advice " +
                        "continues to stand the test of time.",R.drawable.fifth));
        arrayList.add(new Book("Start with Why by Simon Sinek",
                "One of the first problems entrepreneurs face is finding and sustaining " +
                        "that feeling of inspiration that moves others. Simon Sinek has been on a " +
                        "mission to find out what makes some organizations innovative and influential " +
                        "and find a way to help you feel more inspired at work.",R.drawable.sixth));
        arrayList.add(new Book("Atomic Habits by James Clear",
                "Keeping the inspiration alive in the early days can be challenging, and" +
                        " there’s nothing like bad habits that can get in between you and success.",
                        R.drawable.seventh));
        arrayList.add(new Book("Zero to One by Peter Thiel",
                "If you’re looking for a practical and optimistic book to get your " +
                        "creative juices flowing, pick up Peter Thiel’s Zero to One. Peter Thiel is" +
                        " the co-founder of PayPal, and in his book, he outlines his thoughts and" +
                        " insights on how to build the future you want to see.",R.drawable.eighth));
        arrayList.add(new Book("Good to Great by Jim Collins",
                "Jim Collins began his journey to writing Good to Great with one question:" +
                        " “Why do some businesses last and others don’t?” He assembled a team to study " +
                        "elite companies that lasted longer than 15 years and built success.",R.drawable.ninth));
        arrayList.add(new Book("Think and Grow Rich by Napoleon Hill",
                "Like How to Win Friends and Influence People, Think and Grow Rich has" +
                        " been around since the 1930s and offers insights that stand the test of " +
                        "time. It’s full of timeless wisdom and actionable advice to help you get " +
                        "what you want out of life.",R.drawable.tenth));
    }

    private void setAdapter() {
        bookAdapter=new BookAdapter(arrayList);
        recyclerView.setAdapter(bookAdapter);
    }

}