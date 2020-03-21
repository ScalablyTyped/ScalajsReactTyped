package typingsJapgolly.actionsOnGoogle.actionssdkMod

import typingsJapgolly.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Suggestions")
@js.native
class Suggestions protected ()
  extends typingsJapgolly.actionsOnGoogle.conversationMod.Suggestions
     with _IncomingMessage {
  /**
    * @param suggestions Texts of the suggestions.
    * @public
    */
  def this(suggestions: (js.Array[String] | String)*) = this()
}

