package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.dateFnsNumbers.`0`
import typingsJapgolly.dateFns.dateFnsNumbers.`1`
import typingsJapgolly.dateFns.dateFnsNumbers.`2`
import typingsJapgolly.dateFns.dateFnsNumbers.`3`
import typingsJapgolly.dateFns.dateFnsNumbers.`4`
import typingsJapgolly.dateFns.dateFnsNumbers.`5`
import typingsJapgolly.dateFns.dateFnsNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstWeekContainsDate extends js.Object {
  var firstWeekContainsDate: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[typingsJapgolly.dateFns.mod.Locale] = js.undefined
  var useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined
  var useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object AnonFirstWeekContainsDate {
  @scala.inline
  def apply(
    firstWeekContainsDate: Int | Double = null,
    locale: typingsJapgolly.dateFns.mod.Locale = null,
    useAdditionalDayOfYearTokens: js.UndefOr[Boolean] = js.undefined,
    useAdditionalWeekYearTokens: js.UndefOr[Boolean] = js.undefined,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): AnonFirstWeekContainsDate = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalDayOfYearTokens)) __obj.updateDynamic("useAdditionalDayOfYearTokens")(useAdditionalDayOfYearTokens.asInstanceOf[js.Any])
    if (!js.isUndefined(useAdditionalWeekYearTokens)) __obj.updateDynamic("useAdditionalWeekYearTokens")(useAdditionalWeekYearTokens.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstWeekContainsDate]
  }
}

