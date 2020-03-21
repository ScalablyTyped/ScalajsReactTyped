package typingsJapgolly.topojsonSpecification.mod

import typingsJapgolly.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPolygon[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[js.Array[ArcIndexes]]
  @JSName("type")
  var type_MultiPolygon: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
}

object MultiPolygon {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[js.Array[ArcIndexes]],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): MultiPolygon[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon[P]]
  }
}

