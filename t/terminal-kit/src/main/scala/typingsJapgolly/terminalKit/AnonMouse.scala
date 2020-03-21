package typingsJapgolly.terminalKit

import typingsJapgolly.terminalKit.terminalKitStrings.button
import typingsJapgolly.terminalKit.terminalKitStrings.drag
import typingsJapgolly.terminalKit.terminalKitStrings.motion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMouse extends js.Object {
  var mouse: js.UndefOr[button | drag | motion] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
}

object AnonMouse {
  @scala.inline
  def apply(mouse: button | drag | motion = null, safe: js.UndefOr[Boolean] = js.undefined): AnonMouse = {
    val __obj = js.Dynamic.literal()
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMouse]
  }
}

