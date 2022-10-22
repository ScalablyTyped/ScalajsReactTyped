package typingsJapgolly.johnnyFive.mod

import typingsJapgolly.johnnyFive.johnnyFiveStrings.down
import typingsJapgolly.johnnyFive.johnnyFiveStrings.hold
import typingsJapgolly.johnnyFive.johnnyFiveStrings.press
import typingsJapgolly.johnnyFive.johnnyFiveStrings.release
import typingsJapgolly.johnnyFive.johnnyFiveStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Button")
@js.native
open class Button protected () extends StObject {
  def this(pin: String) = this()
  def this(pin: Double) = this()
  def this(pin: ButtonOption) = this()
  
  var downValue: Double = js.native
  
  var holdtime: Double = js.native
  
  var id: String = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_down(event: down, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_hold(event: hold, cb: js.Function1[/* holdTime */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_press(event: press, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_release(event: release, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_up(event: up, cb: js.Function0[Unit]): this.type = js.native
  
  var pin: Double | String = js.native
  
  var upValue: Double = js.native
}
