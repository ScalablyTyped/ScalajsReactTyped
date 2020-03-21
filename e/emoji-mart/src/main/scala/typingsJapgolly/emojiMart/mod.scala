package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.dataMod.Data
import typingsJapgolly.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typingsJapgolly.emojiMart.sharedPropsMod.EmojiSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NimbleEmojiIndex protected ()
    extends typingsJapgolly.emojiMart.distEsMod.NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}

