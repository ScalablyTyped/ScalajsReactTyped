package typingsJapgolly.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvailable extends js.Object {
  var available: Double
  var blocked: js.UndefOr[Double] = js.undefined
  var debt: js.UndefOr[Double] = js.undefined
  var deposition_pending: js.UndefOr[Double] = js.undefined
  var hold: js.UndefOr[Double] = js.undefined
  var total: Double
}

object AnonAvailable {
  @scala.inline
  def apply(
    available: Double,
    total: Double,
    blocked: Int | Double = null,
    debt: Int | Double = null,
    deposition_pending: Int | Double = null,
    hold: Int | Double = null
  ): AnonAvailable = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (blocked != null) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    if (debt != null) __obj.updateDynamic("debt")(debt.asInstanceOf[js.Any])
    if (deposition_pending != null) __obj.updateDynamic("deposition_pending")(deposition_pending.asInstanceOf[js.Any])
    if (hold != null) __obj.updateDynamic("hold")(hold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvailable]
  }
}

