package typingsJapgolly.d3.mod

import typingsJapgolly.d3Force.mod.ForceLink_
import typingsJapgolly.d3Force.mod.SimulationLinkDatum
import typingsJapgolly.d3Force.mod.SimulationNodeDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "forceLink")
@js.native
object forceLink extends js.Object {
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](): ForceLink_[NodeDatum, LinksDatum] = js.native
  def apply[NodeDatum /* <: SimulationNodeDatum */, LinksDatum /* <: SimulationLinkDatum[NodeDatum] */](links: js.Array[LinksDatum]): ForceLink_[NodeDatum, LinksDatum] = js.native
}

