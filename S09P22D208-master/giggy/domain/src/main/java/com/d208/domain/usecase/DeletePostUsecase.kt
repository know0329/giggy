package com.d208.domain.usecase

import com.d208.domain.repository.PostRepository
import com.d208.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class DeletePostUsecase @Inject constructor(
    private val postRepository: PostRepository
) {
    suspend fun execute(remoteErrorEmitter: RemoteErrorEmitter, id : Long) = postRepository.deletePost(remoteErrorEmitter, id)
}