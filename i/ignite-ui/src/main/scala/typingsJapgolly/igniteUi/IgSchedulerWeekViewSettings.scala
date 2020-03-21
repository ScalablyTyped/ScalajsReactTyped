package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSchedulerWeekViewSettings
  extends /**
	 * Option for IgSchedulerWeekViewSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the time slots duration. 5, 6, 10, 15, 30 and 60 minutes are supported.
  	 *
  	 */
  var timeSlotInterval: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the week view display mode (whether to show all days or just working days).
  	 *
  	 */
  var weekViewDisplayMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets whether to display all hours or just working hours.
  	 *
  	 */
  var workingHoursDisplayMode: js.UndefOr[String] = js.undefined
}

object IgSchedulerWeekViewSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSchedulerWeekViewSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    timeSlotInterval: String = null,
    weekViewDisplayMode: String = null,
    workingHoursDisplayMode: String = null
  ): IgSchedulerWeekViewSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (timeSlotInterval != null) __obj.updateDynamic("timeSlotInterval")(timeSlotInterval.asInstanceOf[js.Any])
    if (weekViewDisplayMode != null) __obj.updateDynamic("weekViewDisplayMode")(weekViewDisplayMode.asInstanceOf[js.Any])
    if (workingHoursDisplayMode != null) __obj.updateDynamic("workingHoursDisplayMode")(workingHoursDisplayMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSchedulerWeekViewSettings]
  }
}

