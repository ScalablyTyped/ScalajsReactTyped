package typingsJapgolly.actionsOnGoogle.mod

import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "OrderUpdate")
@js.native
class OrderUpdate protected ()
  extends typingsJapgolly.actionsOnGoogle.actionssdkMod.OrderUpdate {
  def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
  /**
    * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
    *     or {@link GoogleActionsOrdersV3OrderUpdate}
    *     if using ordersv3
    * @public
    */
  def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
}

