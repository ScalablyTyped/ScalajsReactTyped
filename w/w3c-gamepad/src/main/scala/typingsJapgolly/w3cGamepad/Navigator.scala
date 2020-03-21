package typingsJapgolly.w3cGamepad

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.w3cGamepad.Gamepad.GamepadList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /**
    * The currently connected and interacted-with gamepads. Gamepads must only appear in the list if they are currently connected to the user agent, and have been interacted with by the user. Otherwise, they must not appear in the list to avoid a malicious page from fingerprinting the user based on connected devices.
    * @readonly
    */
  def getGamepads(): js.Array[typingsJapgolly.w3cGamepad.Gamepad.Gamepad]
  def webkitGetGamepads(): GamepadList
}

object Navigator {
  @scala.inline
  def apply(
    getGamepads: CallbackTo[js.Array[typingsJapgolly.w3cGamepad.Gamepad.Gamepad]],
    webkitGetGamepads: CallbackTo[GamepadList]
  ): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGamepads")(getGamepads.toJsFn)
    __obj.updateDynamic("webkitGetGamepads")(webkitGetGamepads.toJsFn)
    __obj.asInstanceOf[Navigator]
  }
}

