package typingsJapgolly.nivoLine

import typingsJapgolly.nivoLine.mod.LineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY extends js.Object {
  var x: js.UndefOr[LineValue] = js.undefined
  var y: js.UndefOr[LineValue] = js.undefined
}

object AnonY {
  @scala.inline
  def apply(x: LineValue = null, y: LineValue = null): AnonY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonY]
  }
}

