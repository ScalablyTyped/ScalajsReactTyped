package typingsJapgolly.arcgisToGeojsonUtils

import typingsJapgolly.arcgisRestApi.mod.Geometry
import typingsJapgolly.geojson.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arcgis-to-geojson-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def arcgisToGeoJSON[T /* <: Geometry */](arcgis: T): GeometryObject = js.native
  def geojsonToArcGIS(geojson: GeometryObject): Geometry = js.native
}

