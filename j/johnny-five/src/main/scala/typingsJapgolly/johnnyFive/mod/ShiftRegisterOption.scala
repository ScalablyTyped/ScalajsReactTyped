package typingsJapgolly.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShiftRegisterOption extends js.Object {
  var isAnode: js.UndefOr[Boolean] = js.undefined
  var pins: js.Any
}

object ShiftRegisterOption {
  @scala.inline
  def apply(pins: js.Any, isAnode: js.UndefOr[Boolean] = js.undefined): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnode)) __obj.updateDynamic("isAnode")(isAnode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftRegisterOption]
  }
}

