package typingsJapgolly.leaflet.mod

import typingsJapgolly.geojson.mod.MultiPolygon
import typingsJapgolly.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Polygon")
@js.native
class Polygon_[P] protected () extends Polyline_[Polygon | MultiPolygon, P] {
  def this(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]) = this()
  def this(
    latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
    options: PolylineOptions
  ) = this()
}

