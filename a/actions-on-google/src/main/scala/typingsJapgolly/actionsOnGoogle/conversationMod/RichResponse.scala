package typingsJapgolly.actionsOnGoogle.conversationMod

import typingsJapgolly.actionsOnGoogle.richMod.RichResponseItem
import typingsJapgolly.actionsOnGoogle.richMod.RichResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "RichResponse")
@js.native
class RichResponse protected ()
  extends typingsJapgolly.actionsOnGoogle.responseMod.RichResponse {
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: RichResponseItem*) = this()
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: js.Array[RichResponseItem]) = this()
  /**
    * @param options RichResponse options
    * @public
    */
  def this(options: RichResponseOptions) = this()
}

