package typingsJapgolly.overlayscrollbars

import typingsJapgolly.overlayscrollbars.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXEasing extends js.Object {
  var x: js.UndefOr[Easing] = js.undefined
  var y: js.UndefOr[Easing] = js.undefined
}

object AnonXEasing {
  @scala.inline
  def apply(x: Easing = null, y: Easing = null): AnonXEasing = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXEasing]
  }
}

