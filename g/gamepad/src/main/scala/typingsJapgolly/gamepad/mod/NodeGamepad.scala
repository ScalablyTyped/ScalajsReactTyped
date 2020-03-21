package typingsJapgolly.gamepad.mod

import typingsJapgolly.gamepad.gamepadStrings.attach
import typingsJapgolly.gamepad.gamepadStrings.down
import typingsJapgolly.gamepad.gamepadStrings.move
import typingsJapgolly.gamepad.gamepadStrings.remove
import typingsJapgolly.gamepad.gamepadStrings.up
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGamepad extends EventEmitter {
  def detectDevices(): Unit = js.native
  def deviceAtIndex(deviceIndex: Double): GamepadInstance = js.native
  def init(): Unit = js.native
  def numDevices(): Double = js.native
  @JSName("on")
  def on_attach(event: attach, listener: js.Function2[/* deviceID */ Double, /* device */ GamepadInstance, Unit]): this.type = js.native
  @JSName("on")
  def on_down(
    event: down,
    listener: js.Function3[/* deviceID */ Double, /* buttonID */ Double, /* timestamp */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_move(
    event: move,
    listener: js.Function5[
      /* deviceID */ Double, 
      /* axisID */ Double, 
      /* value */ Double, 
      /* lastValue */ Double, 
      /* timestamp */ Double, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* deviceID */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_up(
    event: up,
    listener: js.Function3[/* deviceID */ Double, /* buttonID */ Double, /* timestamp */ Double, Unit]
  ): this.type = js.native
  def processEvents(): Unit = js.native
  def shutdown(): Unit = js.native
}

