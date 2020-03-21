package typingsJapgolly.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderMod extends js.Object {
  @js.native
  class AttachmentSticker ()
    extends typingsJapgolly.instagramPrivateApi.attachmentStickerMod.AttachmentSticker
  
  @js.native
  class ChatSticker ()
    extends typingsJapgolly.instagramPrivateApi.chatStickerMod.ChatSticker
  
  @js.native
  class CountdownSticker ()
    extends typingsJapgolly.instagramPrivateApi.countdownStickerMod.CountdownSticker
  
  @js.native
  class HashtagSticker ()
    extends typingsJapgolly.instagramPrivateApi.hashtagStickerMod.HashtagSticker
  
  @js.native
  abstract class InstaSticker ()
    extends typingsJapgolly.instagramPrivateApi.instaStickerMod.InstaSticker
  
  @js.native
  class LocationSticker ()
    extends typingsJapgolly.instagramPrivateApi.locationStickerMod.LocationSticker
  
  @js.native
  class MentionSticker ()
    extends typingsJapgolly.instagramPrivateApi.mentionStickerMod.MentionSticker
  
  @js.native
  class PollSticker ()
    extends typingsJapgolly.instagramPrivateApi.pollStickerMod.PollSticker
  
  @js.native
  class QuestionSticker ()
    extends typingsJapgolly.instagramPrivateApi.questionStickerMod.QuestionSticker
  
  @js.native
  class QuizSticker ()
    extends typingsJapgolly.instagramPrivateApi.quizStickerMod.QuizSticker
  
  @js.native
  class SliderSticker ()
    extends typingsJapgolly.instagramPrivateApi.sliderStickerMod.SliderSticker
  
  @js.native
  class StickerBuilder ()
    extends typingsJapgolly.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def attachment(options: DiffAttachmentStickerInst): typingsJapgolly.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser): typingsJapgolly.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def attachmentFromMedia(mediaInfo: AnonUser, additional: PartialAttachmentSticker): typingsJapgolly.instagramPrivateApi.stickersMod.AttachmentSticker = js.native
    def chat(options: DiffChatStickerInstaStick): typingsJapgolly.instagramPrivateApi.stickersMod.ChatSticker = js.native
    def countdown(options: DiffCountdownStickerInsta): typingsJapgolly.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    def hashtag(options: DiffHashtagStickerInstaSt): typingsJapgolly.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    def location(options: DiffLocationStickerInstaS): typingsJapgolly.instagramPrivateApi.stickersMod.LocationSticker = js.native
    def mention(options: DiffMentionStickerInstaSt): typingsJapgolly.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser): typingsJapgolly.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def mentionReel(mediaInfo: AnonUser, additional: PartialMentionSticker): typingsJapgolly.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def poll(options: DiffPollStickerInstaStick): typingsJapgolly.instagramPrivateApi.stickersMod.PollSticker = js.native
    def question(options: DiffQuestionStickerInstaS): typingsJapgolly.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    def quiz(options: DiffQuizStickerInstaStick): typingsJapgolly.instagramPrivateApi.stickersMod.QuizSticker = js.native
    def slider(options: DiffSliderStickerInstaSti): typingsJapgolly.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
  
}

