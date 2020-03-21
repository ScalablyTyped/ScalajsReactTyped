package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMax extends js.Object {
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var proportion: js.UndefOr[Double] = js.native
}

object AnonMax {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, proportion: Int | Double = null): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (proportion != null) __obj.updateDynamic("proportion")(proportion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

