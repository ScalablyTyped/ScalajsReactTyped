package typingsJapgolly.reactJoyride

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriamodal extends js.Object {
  var `aria-modal`: Boolean
  var role: String
  def ref(): Unit
}

object AnonAriamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: Callback, role: String): AnonAriamodal = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.asInstanceOf[AnonAriamodal]
  }
}

