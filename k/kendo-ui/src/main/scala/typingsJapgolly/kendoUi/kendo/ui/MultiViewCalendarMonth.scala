package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarMonth extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[String] = js.undefined
  var weekNumber: js.UndefOr[String] = js.undefined
}

object MultiViewCalendarMonth {
  @scala.inline
  def apply(content: String = null, empty: String = null, weekNumber: String = null): MultiViewCalendarMonth = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (weekNumber != null) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiViewCalendarMonth]
  }
}

