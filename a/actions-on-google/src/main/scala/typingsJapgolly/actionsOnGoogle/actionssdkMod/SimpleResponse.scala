package typingsJapgolly.actionsOnGoogle.actionssdkMod

import typingsJapgolly.actionsOnGoogle.incomingMod._IncomingMessage
import typingsJapgolly.actionsOnGoogle.simpleMod.SimpleResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "SimpleResponse")
@js.native
class SimpleResponse protected ()
  extends typingsJapgolly.actionsOnGoogle.conversationMod.SimpleResponse
     with _IncomingMessage {
  def this(options: String) = this()
  /**
    * @param options SimpleResponse options
    * @public
    */
  def this(options: SimpleResponseOptions) = this()
}

