package com.example.month2lesson2.randomModels

data class CoverPhotoX(
    val alt_description: String,
    val blur_hash: String,
    val color: String,
    val created_at: String,
    val current_user_collections: List<Any>,
    val description: String,
    val height: Int,
    val id: String,
    val liked_by_user: Boolean,
    val likes: Int,
    val links: Links,
    val plus: Boolean,
    val premium: Boolean,
    val promoted_at: String,
    val sponsorship: Any,
    val topic_submissions: TopicSubmissionsX,
    val updated_at: String,
    val urls: UrlsX,
    val user: UserX,
    val width: Int
)