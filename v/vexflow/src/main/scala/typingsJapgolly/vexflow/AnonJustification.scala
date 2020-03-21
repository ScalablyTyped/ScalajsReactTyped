package typingsJapgolly.vexflow

import typingsJapgolly.vexflow.Vex.Flow.TextNote.Justification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJustification extends js.Object {
  var justification: js.UndefOr[Justification] = js.undefined
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object AnonJustification {
  @scala.inline
  def apply(justification: Justification = null, shift_x: Int | Double = null, shift_y: Int | Double = null): AnonJustification = {
    val __obj = js.Dynamic.literal()
    if (justification != null) __obj.updateDynamic("justification")(justification.asInstanceOf[js.Any])
    if (shift_x != null) __obj.updateDynamic("shift_x")(shift_x.asInstanceOf[js.Any])
    if (shift_y != null) __obj.updateDynamic("shift_y")(shift_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJustification]
  }
}

