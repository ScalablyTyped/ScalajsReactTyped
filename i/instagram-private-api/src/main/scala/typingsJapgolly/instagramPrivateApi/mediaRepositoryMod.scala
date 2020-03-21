package typingsJapgolly.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`2`
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typingsJapgolly.instagramPrivateApi.mediaConfigureOptionsMod.MediaConfigureTimelineOptions
import typingsJapgolly.instagramPrivateApi.mediaConfigureSidecarOptionsMod.MediaConfigureSidecarOptions
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryPhotoOptions
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.MediaConfigureStoryVideoOptions
import typingsJapgolly.instagramPrivateApi.mediaConfigureToIgtvOptionsMod.MediaConfigureToIgtvOptions
import typingsJapgolly.instagramPrivateApi.mediaConfigureVideoOptionsMod.MediaConfigureTimelineVideoOptions
import typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod.LikeRequestOptions
import typingsJapgolly.instagramPrivateApi.mediaLikeOptionsMod.UnlikeRequestOptions
import typingsJapgolly.instagramPrivateApi.mediaRepositoryCheckOffensiveCommentResponseMod.MediaRepositoryCheckOffensiveCommentResponseRootObject
import typingsJapgolly.instagramPrivateApi.mediaRepositoryCommentResponseMod.MediaRepositoryCommentResponseComment
import typingsJapgolly.instagramPrivateApi.mediaRepositoryConfigureResponseMod.MediaRepositoryConfigureResponseRootObject
import typingsJapgolly.instagramPrivateApi.mediaRepositoryInfoResponseMod.MediaEditResponseRootObject
import typingsJapgolly.instagramPrivateApi.mediaRepositoryInfoResponseMod.MediaInfoResponseRootObject
import typingsJapgolly.instagramPrivateApi.mediaRepositoryLikersResponseMod.MediaRepositoryLikersResponseRootObject
import typingsJapgolly.instagramPrivateApi.mediaUpdatedMediaResponseMod.MediaUpdatedMediaResponseRootObject
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsJapgolly.instagramPrivateApi.storyResponseOptionsMod.StoryMusicQuestionResponse
import typingsJapgolly.instagramPrivateApi.storyResponseOptionsMod.StoryTextQuestionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/media.repository", JSImport.Namespace)
@js.native
object mediaRepositoryMod extends js.Object {
  @js.native
  class MediaRepository () extends Repository {
    var applyConfigureDefaults: js.Any = js.native
    var likeAction: js.Any = js.native
    def blocked(): js.Promise[js.Array[String]] = js.native
    def checkOffensiveComment(commentText: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    def checkOffensiveComment(commentText: String, mediaId: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    def comment(hasMediaIdTextReplyToCommentIdModule: AnonModule): js.Promise[MediaRepositoryCommentResponseComment] = js.native
    def commentsBulkDelete(mediaId: String, commentIds: js.Array[String]): js.Promise[StatusResponse] = js.native
    def commentsDisable(mediaId: js.Any): js.Promise[_] = js.native
    def commentsEnable(mediaId: js.Any): js.Promise[_] = js.native
    def configure(options: MediaConfigureTimelineOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def configureSidecar(options: MediaConfigureSidecarOptions): js.Promise[_] = js.native
    def configureToIgtv(options: MediaConfigureToIgtvOptions): js.Promise[_] = js.native
    def configureToStory(options: MediaConfigureStoryPhotoOptions): js.Promise[_] = js.native
    def configureToStoryVideo(options: MediaConfigureStoryVideoOptions): js.Promise[_] = js.native
    def configureVideo(options: MediaConfigureTimelineVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def delete(hasMediaIdMediaType: AnonMediaId): js.Promise[_] = js.native
    def editMedia(hasMediaIdCaptionText: AnonCaptionText): js.Promise[MediaEditResponseRootObject] = js.native
    def info(mediaId: String): js.Promise[MediaInfoResponseRootObject] = js.native
    def like(options: LikeRequestOptions): js.Promise[_] = js.native
    def likers(id: String): js.Promise[MediaRepositoryLikersResponseRootObject] = js.native
    def onlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    def save(mediaId: String): js.Promise[_] = js.native
    def seen(reels: StringDictionary[js.Array[String]]): js.Promise[StatusResponse] = js.native
    def seen(reels: StringDictionary[js.Array[String]], module: IgAppModule): js.Promise[StatusResponse] = js.native
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: String, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: Double, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: String, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: Double, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuizAnswer(mediaId: String, quizId: String, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storyQuizAnswer(mediaId: String, quizId: Double, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: String, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: Double, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: String, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: Double, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: String, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: Double, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: String, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: Double, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storySliderVote(mediaId: String, sliderId: String, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storySliderVote(mediaId: String, sliderId: Double, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def undoOnlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    def unlike(options: UnlikeRequestOptions): js.Promise[_] = js.native
    def unsave(mediaId: String): js.Promise[_] = js.native
    def uploadFinish(options: AnonSourcetype): js.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object MediaRepository extends js.Object {
    var stringifyStoryStickers: js.Any = js.native
  }
  
}

