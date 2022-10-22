package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.distEsUtilsDataMod.Data
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.BaseEmoji
import typingsJapgolly.emojiMart.distEsUtilsSharedPropsMod.EmojiSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emoji-mart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("emoji-mart", "NimbleEmojiIndex")
  @js.native
  open class NimbleEmojiIndex protected ()
    extends typingsJapgolly.emojiMart.distEsMod.NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  inline def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmojiDataFromNative")(nativeString.asInstanceOf[js.Any], set.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[BaseEmoji]
}
