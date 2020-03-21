package typingsJapgolly.d3.mod

import typingsJapgolly.d3Geo.mod.ExtendedFeature
import typingsJapgolly.d3Geo.mod.ExtendedFeatureCollection
import typingsJapgolly.d3Geo.mod.ExtendedGeometryCollection
import typingsJapgolly.d3Geo.mod.GeoGeometryObjects
import typingsJapgolly.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoLength")
@js.native
object geoLength extends js.Object {
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = js.native
  def apply(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = js.native
  def apply(`object`: GeoGeometryObjects): Double = js.native
}

