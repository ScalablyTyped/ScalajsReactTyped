package typingsJapgolly.osmtogeojson.mod

import typingsJapgolly.osmtogeojson.mod.GeoJSON.GeoJSONObject
import typingsJapgolly.osmtogeojson.mod.OsmJSON.OsmJSONObject
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsmToGeoJSON extends js.Object {
  def apply(data: OsmJSONObject): GeoJSONObject = js.native
  def apply(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def apply(data: Document_): GeoJSONObject = js.native
  def apply(data: Document_, options: Options): GeoJSONObject = js.native
  def toGeojson(data: OsmJSONObject): GeoJSONObject = js.native
  def toGeojson(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def toGeojson(data: Document_): GeoJSONObject = js.native
  def toGeojson(data: Document_, options: Options): GeoJSONObject = js.native
}

