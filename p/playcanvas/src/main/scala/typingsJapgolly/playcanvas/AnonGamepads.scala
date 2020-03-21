package typingsJapgolly.playcanvas

import typingsJapgolly.playcanvas.pc.GamePads
import typingsJapgolly.playcanvas.pc.Keyboard
import typingsJapgolly.playcanvas.pc.Mouse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGamepads extends js.Object {
  var gamepads: js.UndefOr[GamePads] = js.undefined
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  var mouse: js.UndefOr[Mouse] = js.undefined
}

object AnonGamepads {
  @scala.inline
  def apply(gamepads: GamePads = null, keyboard: Keyboard = null, mouse: Mouse = null): AnonGamepads = {
    val __obj = js.Dynamic.literal()
    if (gamepads != null) __obj.updateDynamic("gamepads")(gamepads.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGamepads]
  }
}

