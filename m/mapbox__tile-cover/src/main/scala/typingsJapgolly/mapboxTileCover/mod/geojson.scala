package typingsJapgolly.mapboxTileCover.mod

import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/tile-cover", "geojson")
@js.native
object geojson extends js.Object {
  def apply(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
}

