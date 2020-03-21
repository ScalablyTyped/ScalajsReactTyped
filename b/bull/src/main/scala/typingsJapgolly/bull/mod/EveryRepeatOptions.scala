package typingsJapgolly.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EveryRepeatOptions extends RepeatOptions {
  /**
    * Repeat every millis (cron setting cannot be used together with this setting.)
    */
  var every: Double
}

object EveryRepeatOptions {
  @scala.inline
  def apply(
    every: Double,
    endDate: js.Date | String | Double = null,
    limit: Int | Double = null,
    tz: String = null
  ): EveryRepeatOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (tz != null) __obj.updateDynamic("tz")(tz.asInstanceOf[js.Any])
    __obj.asInstanceOf[EveryRepeatOptions]
  }
}

