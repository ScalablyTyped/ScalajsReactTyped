package typingsJapgolly.topojsonSpecification.mod

import typingsJapgolly.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.topojsonSpecification.mod.Point[P]
  - typingsJapgolly.topojsonSpecification.mod.MultiPoint[P]
  - typingsJapgolly.topojsonSpecification.mod.LineString[P]
  - typingsJapgolly.topojsonSpecification.mod.MultiLineString[P]
  - typingsJapgolly.topojsonSpecification.mod.Polygon[P]
  - typingsJapgolly.topojsonSpecification.mod.MultiPolygon[P]
  - typingsJapgolly.topojsonSpecification.mod.GeometryCollection[P]
  - typingsJapgolly.topojsonSpecification.mod.NullObject
*/
trait GeometryObject[P /* <: Properties */] extends js.Object

object GeometryObject {
  @scala.inline
  def MultiLineString[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiLineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def GeometryCollection[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def Point[P /* <: Properties */](
    coordinates: Positions,
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Point,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def LineString[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.LineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def MultiPolygon[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def MultiPoint[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPoint,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def NullObject[P /* <: Properties */](`type`: Null, bbox: BBox = null, id: Double | String = null, properties: js.Object = null): GeometryObject[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
  @scala.inline
  def Polygon[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Polygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryObject[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObject[P]]
  }
}

