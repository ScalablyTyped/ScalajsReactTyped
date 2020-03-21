package typingsJapgolly.actionsOnGoogle.mod

import typingsJapgolly.actionsOnGoogle.richMod.RichResponseItem
import typingsJapgolly.actionsOnGoogle.richMod.RichResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "RichResponse")
@js.native
class RichResponse protected ()
  extends typingsJapgolly.actionsOnGoogle.actionssdkMod.RichResponse {
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

