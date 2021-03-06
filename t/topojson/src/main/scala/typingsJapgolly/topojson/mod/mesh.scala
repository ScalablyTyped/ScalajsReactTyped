package typingsJapgolly.topojson.mod

import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.topojsonSpecification.mod.GeometryObject
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "mesh")
@js.native
object mesh extends js.Object {
  def apply(topology: Topology[Objects[Properties]]): MultiLineString = js.native
  def apply(topology: Topology[Objects[Properties]], obj: GeometryObject[js.Object]): MultiLineString = js.native
  def apply(
    topology: Topology[Objects[Properties]],
    obj: GeometryObject[js.Object],
    filter: js.Function2[/* a */ GeometryObject[js.Object], /* b */ GeometryObject[js.Object], Boolean]
  ): MultiLineString = js.native
}

