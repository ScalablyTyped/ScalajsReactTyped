package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.day
import typingsJapgolly.devextreme.devextremeStrings.hour
import typingsJapgolly.devextreme.devextremeStrings.millisecond
import typingsJapgolly.devextreme.devextremeStrings.minute
import typingsJapgolly.devextreme.devextremeStrings.month
import typingsJapgolly.devextreme.devextremeStrings.quarter
import typingsJapgolly.devextreme.devextremeStrings.second
import typingsJapgolly.devextreme.devextremeStrings.week
import typingsJapgolly.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VizRange extends js.Object {
  /** The range's end value. */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  /** The range's length. */
  var length: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** The range's start value. */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}

object VizRange {
  @scala.inline
  def apply(
    endValue: Double | js.Date | String = null,
    length: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    startValue: Double | js.Date | String = null
  ): VizRange = {
    val __obj = js.Dynamic.literal()
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VizRange]
  }
}

