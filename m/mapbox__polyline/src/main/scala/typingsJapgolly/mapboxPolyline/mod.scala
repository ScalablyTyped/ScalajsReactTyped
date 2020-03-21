package typingsJapgolly.mapboxPolyline

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.LineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/polyline", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(string: String): js.Array[js.Array[Double]] = js.native
  def decode(string: String, precision: Double): js.Array[js.Array[Double]] = js.native
  def encode(coordinates: js.Array[js.Array[Double]]): String = js.native
  def encode(coordinates: js.Array[js.Array[Double]], precision: Double): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = js.native
  def fromGeoJSON(geojson: LineString): String = js.native
  def fromGeoJSON(geojson: LineString, precision: Double): String = js.native
  def toGeoJSON(string: String): LineString = js.native
  def toGeoJSON(string: String, precision: Double): LineString = js.native
}

