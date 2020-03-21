package typingsJapgolly.d3.mod

import typingsJapgolly.d3Force.mod.Simulation
import typingsJapgolly.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceSimulation")
@js.native
object forceSimulation extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */](): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */](nodesData: js.Array[NodeDatum]): Simulation[NodeDatum, js.UndefOr[scala.Nothing]] = js.native
}

