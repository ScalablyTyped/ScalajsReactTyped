package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedFeature
import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedFeatureCollection
import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedGeometryCollection
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoGeometryObjects
import typingsJapgolly.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoContains")
@js.native
object geoContains extends js.Object {
  def apply(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    point: js.Tuple2[Double, Double]
  ): Boolean = js.native
  def apply(
    `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties],
    point: js.Tuple2[Double, Double]
  ): Boolean = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects], point: js.Tuple2[Double, Double]): Boolean = js.native
  def apply(`object`: GeoGeometryObjects, point: js.Tuple2[Double, Double]): Boolean = js.native
}

