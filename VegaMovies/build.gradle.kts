version = 5

cloudstream {
    language = "hi"
    // All of these properties are optional, you can safely remove them

    description = "Includes LuxMovies, Rogmovies"
     authors = listOf("sturdyfishstick1")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "AsianDrama",
        "Anime"
    )

    iconUrl = "https://github.com/techmind09/sturdyfishstick1/raw/refs/heads/main/VegaMovies/icon.jpg"
}
