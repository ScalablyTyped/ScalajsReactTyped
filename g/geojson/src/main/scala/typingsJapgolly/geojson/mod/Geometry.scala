package typingsJapgolly.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.geojson.mod.Point
  - typingsJapgolly.geojson.mod.MultiPoint
  - typingsJapgolly.geojson.mod.LineString
  - typingsJapgolly.geojson.mod.MultiLineString
  - typingsJapgolly.geojson.mod.Polygon
  - typingsJapgolly.geojson.mod.MultiPolygon
  - typingsJapgolly.geojson.mod.GeometryCollection
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def GeometryCollection(
    geometries: js.Array[Geometry],
    `type`: typingsJapgolly.geojson.geojsonStrings.GeometryCollection,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPolygon(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typingsJapgolly.geojson.geojsonStrings.MultiPolygon,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPoint(
    coordinates: js.Array[Position],
    `type`: typingsJapgolly.geojson.geojsonStrings.MultiPoint,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Point(coordinates: Position, `type`: typingsJapgolly.geojson.geojsonStrings.Point, bbox: BBox = null): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiLineString(
    coordinates: js.Array[js.Array[Position]],
    `type`: typingsJapgolly.geojson.geojsonStrings.MultiLineString,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def LineString(
    coordinates: js.Array[Position],
    `type`: typingsJapgolly.geojson.geojsonStrings.LineString,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Polygon(
    coordinates: js.Array[js.Array[Position]],
    `type`: typingsJapgolly.geojson.geojsonStrings.Polygon,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

