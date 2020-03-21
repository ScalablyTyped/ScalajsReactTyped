package typingsJapgolly.expo

import typingsJapgolly.expo.expoStrings.day
import typingsJapgolly.expo.expoStrings.hour
import typingsJapgolly.expo.expoStrings.minute
import typingsJapgolly.expo.expoStrings.month
import typingsJapgolly.expo.expoStrings.week
import typingsJapgolly.expo.expoStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntervalMs extends js.Object {
  var intervalMs: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.undefined
  var time: js.UndefOr[Double | js.Date] = js.undefined
}

object AnonIntervalMs {
  @scala.inline
  def apply(
    intervalMs: Int | Double = null,
    repeat: minute | hour | day | week | month | year = null,
    time: Double | js.Date = null
  ): AnonIntervalMs = {
    val __obj = js.Dynamic.literal()
    if (intervalMs != null) __obj.updateDynamic("intervalMs")(intervalMs.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntervalMs]
  }
}

