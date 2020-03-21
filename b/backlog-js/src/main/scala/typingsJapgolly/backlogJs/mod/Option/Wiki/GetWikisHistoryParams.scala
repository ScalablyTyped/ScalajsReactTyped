package typingsJapgolly.backlogJs.mod.Option.Wiki

import typingsJapgolly.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWikisHistoryParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var maxId: js.UndefOr[Double] = js.undefined
  var minId: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Order] = js.undefined
}

object GetWikisHistoryParams {
  @scala.inline
  def apply(
    count: Int | Double = null,
    maxId: Int | Double = null,
    minId: Int | Double = null,
    order: Order = null
  ): GetWikisHistoryParams = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maxId != null) __obj.updateDynamic("maxId")(maxId.asInstanceOf[js.Any])
    if (minId != null) __obj.updateDynamic("minId")(minId.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWikisHistoryParams]
  }
}

