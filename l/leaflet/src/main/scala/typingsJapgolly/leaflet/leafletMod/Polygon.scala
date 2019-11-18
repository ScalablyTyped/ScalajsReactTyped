package typingsJapgolly.leaflet.leafletMod

import typingsJapgolly.geojson.geojsonMod.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Polygon")
@js.native
class Polygon[P] protected ()
  extends Polyline[typingsJapgolly.geojson.geojsonMod.Polygon | MultiPolygon, P] {
  def this(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]) = this()
  def this(
    latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
    options: PolylineOptions
  ) = this()
}

@JSImport("leaflet", "polygon")
@js.native
object polygon extends js.Object {
  def apply(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Polygon[_] = js.native
  def apply(
    latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
    options: PolylineOptions
  ): Polygon[_] = js.native
}

