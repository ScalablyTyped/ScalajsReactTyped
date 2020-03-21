package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayChangingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the currently selected date.
  	 */
  var currentSelectedDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to newly selected date.
  	 */
  var newSelectedDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DayChangingEventUIParam {
  @scala.inline
  def apply(currentSelectedDate: js.Any = null, newSelectedDate: js.Any = null, owner: js.Any = null): DayChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentSelectedDate != null) __obj.updateDynamic("currentSelectedDate")(currentSelectedDate.asInstanceOf[js.Any])
    if (newSelectedDate != null) __obj.updateDynamic("newSelectedDate")(newSelectedDate.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayChangingEventUIParam]
  }
}

