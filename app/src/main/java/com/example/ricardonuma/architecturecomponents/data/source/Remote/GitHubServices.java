package com.example.ricardonuma.architecturecomponents.data.source.Remote;

import com.example.ricardonuma.architecturecomponents.data.DataSource;
import com.example.ricardonuma.architecturecomponents.data.source.Local.GitHubUser.GitHubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import rx.Single;

public interface GitHubServices {

    String GITHUB_API_BASE_URL = "https://api.github.com/";

    // RETROFIT
    @GET("users")
    Call<List<GitHubUser>> usersCall(@Query("since") String since);

    // RXJAVA
    @GET("users")
    Single<List<GitHubUser>> usersObservable(@Query("since") String since);
}
