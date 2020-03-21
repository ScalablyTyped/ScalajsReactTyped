package typingsJapgolly.dateFns

import typingsJapgolly.dateFns.dateFnsStrings.ceil
import typingsJapgolly.dateFns.dateFnsStrings.day
import typingsJapgolly.dateFns.dateFnsStrings.floor
import typingsJapgolly.dateFns.dateFnsStrings.hour
import typingsJapgolly.dateFns.dateFnsStrings.minute
import typingsJapgolly.dateFns.dateFnsStrings.month
import typingsJapgolly.dateFns.dateFnsStrings.round
import typingsJapgolly.dateFns.dateFnsStrings.second
import typingsJapgolly.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnit extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}

object AnonUnit {
  @scala.inline
  def apply(
    addSuffix: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    roundingMethod: floor | ceil | round = null,
    unit: second | minute | hour | day | month | year = null
  ): AnonUnit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSuffix)) __obj.updateDynamic("addSuffix")(addSuffix.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (roundingMethod != null) __obj.updateDynamic("roundingMethod")(roundingMethod.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnit]
  }
}

