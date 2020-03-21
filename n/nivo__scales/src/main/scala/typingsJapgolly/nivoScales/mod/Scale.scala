package typingsJapgolly.nivoScales.mod

import typingsJapgolly.nivoScales.nivoScalesStrings.auto
import typingsJapgolly.nivoScales.nivoScalesStrings.day
import typingsJapgolly.nivoScales.nivoScalesStrings.hour
import typingsJapgolly.nivoScales.nivoScalesStrings.linear
import typingsJapgolly.nivoScales.nivoScalesStrings.log
import typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
import typingsJapgolly.nivoScales.nivoScalesStrings.minute
import typingsJapgolly.nivoScales.nivoScalesStrings.month
import typingsJapgolly.nivoScales.nivoScalesStrings.point
import typingsJapgolly.nivoScales.nivoScalesStrings.second
import typingsJapgolly.nivoScales.nivoScalesStrings.time
import typingsJapgolly.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nivoScales.mod.LinearScale
  - typingsJapgolly.nivoScales.mod.PointScale
  - typingsJapgolly.nivoScales.mod.TimeScale
  - typingsJapgolly.nivoScales.mod.LogScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def LinearScale(
    `type`: linear,
    max: auto | Double = null,
    min: auto | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PointScale(`type`: point): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(`type`: log, base: Int | Double = null, max: auto | Double = null, min: auto | Double = null): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

