package com.test.redditrss;

import com.test.redditrss.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pyrov on 19.03.2018.
 */

public interface RedditAPI {
    String BASE_URL = "https://www.reddit.com/r/";

    @GET("earthporn/.rss")
    Call<Feed> getFeed();
}
