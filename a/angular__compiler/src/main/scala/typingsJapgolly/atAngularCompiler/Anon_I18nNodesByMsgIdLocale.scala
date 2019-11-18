package typingsJapgolly.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18nNodesByMsgIdLocale extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]]
  var locale: String
}

object Anon_I18nNodesByMsgIdLocale {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]], locale: String): Anon_I18nNodesByMsgIdLocale = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_I18nNodesByMsgIdLocale]
  }
}

