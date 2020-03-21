package typingsJapgolly.d3.mod

import typingsJapgolly.d3Axis.mod.Axis
import typingsJapgolly.d3Axis.mod.AxisDomain
import typingsJapgolly.d3Axis.mod.AxisScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "axisBottom")
@js.native
object axisBottom extends js.Object {
  def apply[Domain /* <: AxisDomain */](scale: AxisScale[Domain]): Axis[Domain] = js.native
}

