package typingsJapgolly.shapefile.mod

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "open")
@js.native
object open extends js.Object {
  def apply(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  def apply(shp: Openable, dbf: Openable, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
}

