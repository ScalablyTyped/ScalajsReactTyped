package typingsJapgolly.nivoScales.mod

import typingsJapgolly.nivoScales.nivoScalesStrings.auto
import typingsJapgolly.nivoScales.nivoScalesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogScale extends Scale {
  var base: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[auto | Double] = js.undefined
  var min: js.UndefOr[auto | Double] = js.undefined
  var `type`: log
}

object LogScale {
  @scala.inline
  def apply(`type`: log, base: Int | Double = null, max: auto | Double = null, min: auto | Double = null): LogScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogScale]
  }
}

