val targetDir = file("xVideos")
if (targetDir.exists() && targetDir.isDirectory) {
    include(":xVideos")
}
