package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersGetByMerchantOrderIdResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersGetByMerchantOrderIdResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The requested order. */
  var order: js.UndefOr[Order] = js.undefined
}

object OrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(kind: String = null, order: Order = null): OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersGetByMerchantOrderIdResponse]
  }
}

