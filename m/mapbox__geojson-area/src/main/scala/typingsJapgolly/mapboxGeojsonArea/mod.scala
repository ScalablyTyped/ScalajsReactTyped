package typingsJapgolly.mapboxGeojsonArea

import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.geojson.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geojson-area", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def geometry(geo: Geometry): Double = js.native
  def ring(coordinates: js.Array[Position]): Double = js.native
}

