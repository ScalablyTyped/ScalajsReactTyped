package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashTimer.d3DashTimerMod.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "timer")
@js.native
object timer extends js.Object {
  def apply(callback: js.Function1[/* elapsed */ Double, Unit]): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer = js.native
  def apply(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer = js.native
}

