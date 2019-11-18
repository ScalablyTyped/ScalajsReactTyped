package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashForce.d3DashForceMod.ForceX
import typingsJapgolly.d3DashForce.d3DashForceMod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceX")
@js.native
object forceX extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceX[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](x: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceX[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](x: Double): ForceX[NodeDatum] = js.native
}

