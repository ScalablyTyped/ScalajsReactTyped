package typingsJapgolly.nivoScales.mod

import typingsJapgolly.nivoScales.nivoScalesStrings.day
import typingsJapgolly.nivoScales.nivoScalesStrings.hour
import typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
import typingsJapgolly.nivoScales.nivoScalesStrings.minute
import typingsJapgolly.nivoScales.nivoScalesStrings.month
import typingsJapgolly.nivoScales.nivoScalesStrings.second
import typingsJapgolly.nivoScales.nivoScalesStrings.time
import typingsJapgolly.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends Scale {
  var format: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.undefined
  var `type`: time
}

object TimeScale {
  @scala.inline
  def apply(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

