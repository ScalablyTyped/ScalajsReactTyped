package typingsJapgolly.topojson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "topology")
@js.native
object topology extends js.Object {
  def apply(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = js.native
  def apply(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = js.native
}

