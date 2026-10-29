// use an integer for version numbers
version = 1
cloudstream {
    description = "Aagmaal - Indian Hot Hindi Web Series"
    authors = listOf("sturdyfishstick1")
    requiresResources = false

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1

    // Correct way to specify tvTypes using TvType enum
    tvTypes = listOf(
        TvType.NSFW
    )
    language = "hi"

    iconUrl = "https://aagmaall.com/wp-content/uploads/2025/07/cropped-aagmaall.png"
}
