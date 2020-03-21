package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.richMod._RichResponseItem
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/order", JSImport.Namespace)
@js.native
object orderMod extends js.Object {
  @js.native
  class OrderUpdate protected ()
    extends _RichResponseItem
       with GoogleActionsV2OrdersOrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
}

