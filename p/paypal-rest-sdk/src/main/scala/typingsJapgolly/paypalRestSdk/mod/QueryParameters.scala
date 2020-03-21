package typingsJapgolly.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters extends js.Object {
  var anchor_type: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var end_time: js.UndefOr[String] = js.undefined
  var event_type: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var page_size: js.UndefOr[Double] = js.undefined
  var payee_id: js.UndefOr[String] = js.undefined
  var sort_by: js.UndefOr[String] = js.undefined
  var sort_order: js.UndefOr[String] = js.undefined
  var start_id: js.UndefOr[String] = js.undefined
  var start_index: js.UndefOr[Double] = js.undefined
  var start_time: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[js.Array[String]] = js.undefined
  var total_count_required: js.UndefOr[Boolean] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var webhook_id: js.UndefOr[String] = js.undefined
}

object QueryParameters {
  @scala.inline
  def apply(
    anchor_type: String = null,
    count: Int | Double = null,
    end_time: String = null,
    event_type: String = null,
    page: Int | Double = null,
    page_size: Int | Double = null,
    payee_id: String = null,
    sort_by: String = null,
    sort_order: String = null,
    start_id: String = null,
    start_index: Int | Double = null,
    start_time: String = null,
    status: js.Array[String] = null,
    total_count_required: js.UndefOr[Boolean] = js.undefined,
    transaction_id: String = null,
    webhook_id: String = null
  ): QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (anchor_type != null) __obj.updateDynamic("anchor_type")(anchor_type.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (end_time != null) __obj.updateDynamic("end_time")(end_time.asInstanceOf[js.Any])
    if (event_type != null) __obj.updateDynamic("event_type")(event_type.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (payee_id != null) __obj.updateDynamic("payee_id")(payee_id.asInstanceOf[js.Any])
    if (sort_by != null) __obj.updateDynamic("sort_by")(sort_by.asInstanceOf[js.Any])
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order.asInstanceOf[js.Any])
    if (start_id != null) __obj.updateDynamic("start_id")(start_id.asInstanceOf[js.Any])
    if (start_index != null) __obj.updateDynamic("start_index")(start_index.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count_required)) __obj.updateDynamic("total_count_required")(total_count_required.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id.asInstanceOf[js.Any])
    if (webhook_id != null) __obj.updateDynamic("webhook_id")(webhook_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
}

