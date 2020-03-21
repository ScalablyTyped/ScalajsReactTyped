package typingsJapgolly.topojson.mod

import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "bbox")
@js.native
object bbox extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): BBox = js.native
}

