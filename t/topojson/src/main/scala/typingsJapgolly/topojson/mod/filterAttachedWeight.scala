package typingsJapgolly.topojson.mod

import typingsJapgolly.topojsonSimplify.mod.Filter_
import typingsJapgolly.topojsonSimplify.mod.RingWeighter
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "filterAttachedWeight")
@js.native
object filterAttachedWeight extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  def apply(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
}

