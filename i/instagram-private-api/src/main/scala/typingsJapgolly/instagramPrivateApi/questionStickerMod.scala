package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.instaStickerMod.InstaSticker
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.music
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/question.sticker", JSImport.Namespace)
@js.native
object questionStickerMod extends js.Object {
  @js.native
  class QuestionSticker () extends InstaSticker {
    var backgroundColor: js.UndefOr[String] = js.native
    var profilePicUrl: js.UndefOr[String] = js.native
    var question: String = js.native
    var questionType: js.UndefOr[text_ | music] = js.native
    var textColor: js.UndefOr[String] = js.native
    var viewerCanInteract: js.UndefOr[Boolean] = js.native
  }
  
}

