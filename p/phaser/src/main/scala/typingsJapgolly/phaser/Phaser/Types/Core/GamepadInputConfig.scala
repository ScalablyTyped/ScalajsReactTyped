package typingsJapgolly.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadInputConfig extends js.Object {
  /**
    * Where the Gamepad Manager listens for gamepad input events.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

object GamepadInputConfig {
  @scala.inline
  def apply(target: js.Any = null): GamepadInputConfig = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadInputConfig]
  }
}

