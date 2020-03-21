package typingsJapgolly.d3.mod

import typingsJapgolly.d3Force.mod.ForceY_
import typingsJapgolly.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceY")
@js.native
object forceY extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): ForceY_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](y: js.Function3[/* d */ NodeDatum, /* i */ Double, /* data */ js.Array[NodeDatum], Double]): ForceY_[NodeDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](y: Double): ForceY_[NodeDatum] = js.native
}

