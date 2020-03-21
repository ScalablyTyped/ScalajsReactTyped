package typingsJapgolly.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var fields: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
  var include: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
  var order: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var where: js.UndefOr[js.Any] = js.undefined
}

object AnonOrder {
  @scala.inline
  def apply(
    fields: String | js.Any | js.Array[_] = null,
    include: String | js.Any | js.Array[_] = null,
    order: String = null,
    skip: Int | Double = null,
    where: js.Any = null
  ): AnonOrder = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrder]
  }
}

