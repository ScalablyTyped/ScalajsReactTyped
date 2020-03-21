package typingsJapgolly.proj4leaflet.mod.leafletAugmentingMod.Proj

import typingsJapgolly.leaflet.mod.GeoJSONOptions
import typingsJapgolly.proj4leaflet.mod.Proj4GeoJSONFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.geoJson")
@js.native
object geoJson extends js.Object {
  def apply(): GeoJSON_ = js.native
  def apply(geojson: Proj4GeoJSONFeature): GeoJSON_ = js.native
  def apply(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[_]): GeoJSON_ = js.native
}

