package typingsJapgolly.geojson2osm

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geojson2osm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def geojson2osm(features: Feature[_, GeoJsonProperties]): js.Any = js.native
  def geojson2osm(features: FeatureCollection[_, GeoJsonProperties]): js.Any = js.native
}

