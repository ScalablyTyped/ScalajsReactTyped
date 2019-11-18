package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashAxis.d3DashAxisMod.Axis
import typingsJapgolly.d3DashAxis.d3DashAxisMod.AxisDomain
import typingsJapgolly.d3DashAxis.d3DashAxisMod.AxisScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "axisTop")
@js.native
object axisTop extends js.Object {
  def apply[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = js.native
}

