package typingsJapgolly.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point
  extends GeoJsonObject
     with Geometry {
  var coordinates: Position
  @JSName("type")
  var type_Point: typingsJapgolly.geojson.geojsonStrings.Point
}

object Point {
  @scala.inline
  def apply(coordinates: Position, `type`: typingsJapgolly.geojson.geojsonStrings.Point, bbox: BBox = null): Point = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

