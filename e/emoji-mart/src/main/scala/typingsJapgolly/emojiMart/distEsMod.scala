package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.distEsUtilsDataMod.Data
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.default
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsMod {
  
  @JSImport("emoji-mart/dist-es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("emoji-mart/dist-es", "NimbleEmojiIndex")
  @js.native
  open class NimbleEmojiIndex protected () extends default {
    def this(data: Data) = this()
  }
  
  inline def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmojiDataFromNative")(nativeString.asInstanceOf[js.Any], set.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[BaseEmoji]
}
