package typingsJapgolly.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndDate extends js.Object {
  var endDate: js.UndefOr[js.Date] = js.undefined
  var startDate: js.UndefOr[js.Date] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonEndDate {
  @scala.inline
  def apply(endDate: js.Date = null, startDate: js.Date = null, text: String = null): AnonEndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndDate]
  }
}

