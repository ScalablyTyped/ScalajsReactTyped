package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.dateFnsNumbers.`0`
import typingsJapgolly.dateFns.dateFnsNumbers.`1`
import typingsJapgolly.dateFns.dateFnsNumbers.`2`
import typingsJapgolly.dateFns.dateFnsNumbers.`3`
import typingsJapgolly.dateFns.dateFnsNumbers.`4`
import typingsJapgolly.dateFns.dateFnsNumbers.`5`
import typingsJapgolly.dateFns.dateFnsNumbers.`6`
import typingsJapgolly.dateFns.dateFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocaleLocale extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}

object AnonLocaleLocale {
  @scala.inline
  def apply(
    firstWeekContainsDate: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    locale: Locale = null,
    weekStartsOn: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null
  ): AnonLocaleLocale = {
    val __obj = js.Dynamic.literal()
    if (firstWeekContainsDate != null) __obj.updateDynamic("firstWeekContainsDate")(firstWeekContainsDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocaleLocale]
  }
}

