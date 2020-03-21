package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.dataMod.Data
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.default
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es", JSImport.Namespace)
@js.native
object distEsMod extends js.Object {
  @js.native
  class NimbleEmojiIndex protected () extends default {
    def this(data: Data) = this()
  }
  
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}

