package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Gamepad API interface contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to. */
@js.native
trait GamepadEvent extends Event_ {
  val gamepad: org.scalajs.dom.experimental.gamepad.Gamepad = js.native
}

@JSGlobal("GamepadEvent")
@js.native
object GamepadEvent
  extends Instantiable2[/* type */ java.lang.String, /* eventInitDict */ GamepadEventInit, GamepadEvent]

