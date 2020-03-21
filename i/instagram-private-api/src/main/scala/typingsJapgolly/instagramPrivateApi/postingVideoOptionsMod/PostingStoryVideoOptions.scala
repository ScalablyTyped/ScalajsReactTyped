package typingsJapgolly.instagramPrivateApi.postingVideoOptionsMod

import typingsJapgolly.instagramPrivateApi.AnonStorystickerids
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.once
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.story
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryAttachedMedia
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryChat
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryCountdown
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryHashtag
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryMention
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryPoll
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuestion
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuiz
import typingsJapgolly.instagramPrivateApi.mediaConfigureStoryOptionsMod.StorySlider
import typingsJapgolly.instagramPrivateApi.postingOptionsMod.PostingStoryLocationSticker
import typingsJapgolly.instagramPrivateApi.postingOptionsMod.PostingStoryOptions
import typingsJapgolly.instagramPrivateApi.stickerBuilderMod.StickerBuilder
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingStoryVideoOptions extends PostingStoryOptions {
  var coverImage: Buffer
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var video: Buffer
}

object PostingStoryVideoOptions {
  @scala.inline
  def apply(
    coverImage: Buffer,
    video: Buffer,
    caption: String = null,
    chat: StoryChat = null,
    countdown: StoryCountdown = null,
    hashtags: js.Array[StoryHashtag] = null,
    link: String = null,
    location: PostingStoryLocationSticker = null,
    media: StoryAttachedMedia = null,
    mentions: js.Array[StoryMention] = null,
    poll: StoryPoll = null,
    question: StoryQuestion = null,
    quiz: StoryQuiz = null,
    recipientUsers: js.Array[String] = null,
    replyType: story | String = null,
    slider: StorySlider = null,
    stickerConfig: (js.Any with AnonStorystickerids) | StickerBuilder = null,
    threadIds: js.Array[String] = null,
    toBesties: js.UndefOr[Boolean] = js.undefined,
    transcodeDelay: Int | Double = null,
    viewMode: replayable | once | String = null
  ): PostingStoryVideoOptions = {
    val __obj = js.Dynamic.literal(coverImage = coverImage.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (chat != null) __obj.updateDynamic("chat")(chat.asInstanceOf[js.Any])
    if (countdown != null) __obj.updateDynamic("countdown")(countdown.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    if (question != null) __obj.updateDynamic("question")(question.asInstanceOf[js.Any])
    if (quiz != null) __obj.updateDynamic("quiz")(quiz.asInstanceOf[js.Any])
    if (recipientUsers != null) __obj.updateDynamic("recipientUsers")(recipientUsers.asInstanceOf[js.Any])
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (stickerConfig != null) __obj.updateDynamic("stickerConfig")(stickerConfig.asInstanceOf[js.Any])
    if (threadIds != null) __obj.updateDynamic("threadIds")(threadIds.asInstanceOf[js.Any])
    if (!js.isUndefined(toBesties)) __obj.updateDynamic("toBesties")(toBesties.asInstanceOf[js.Any])
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingStoryVideoOptions]
  }
}

