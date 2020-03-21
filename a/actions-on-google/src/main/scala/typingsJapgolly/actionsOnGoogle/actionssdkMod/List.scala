package typingsJapgolly.actionsOnGoogle.actionssdkMod

import typingsJapgolly.actionsOnGoogle.incomingMod._IncomingMessage
import typingsJapgolly.actionsOnGoogle.listMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "List")
@js.native
class List protected ()
  extends typingsJapgolly.actionsOnGoogle.conversationMod.List
     with _IncomingMessage {
  /**
    * @param options List options
    * @public
    */
  def this(options: ListOptions) = this()
}

