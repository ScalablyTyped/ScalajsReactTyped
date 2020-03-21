package typingsJapgolly.topojsonSpecification.mod

import typingsJapgolly.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: ArcIndexes
  @JSName("type")
  var type_LineString: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.LineString
}

object LineString {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.LineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): LineString[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString[P]]
  }
}

