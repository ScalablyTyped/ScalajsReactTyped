package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedFeature
import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedFeatureCollection
import typingsJapgolly.d3DashGeo.d3DashGeoMod.ExtendedGeometryCollection
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoGeometryObjects
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoStream
import typingsJapgolly.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoStream")
@js.native
object geoStream extends js.Object {
  def apply(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    stream: GeoStream
  ): Unit = js.native
  def apply(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], stream: GeoStream): Unit = js.native
  def apply(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream): Unit = js.native
  def apply(`object`: GeoGeometryObjects, stream: GeoStream): Unit = js.native
}

