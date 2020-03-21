package typingsJapgolly.osmtogeojson.mod.GeoJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection extends GeoJSONObject {
  var geometries: js.Array[Geometry]
}

object GeometryCollection {
  @scala.inline
  def apply(geometries: js.Array[Geometry], `type`: String): GeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection]
  }
}

