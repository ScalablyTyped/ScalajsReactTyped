package typingsJapgolly.topojsonSpecification.mod

import typingsJapgolly.geojson.mod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var geometries: js.Array[GeometryObject[P]]
  @JSName("type")
  var type_GeometryCollection: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
}

object GeometryCollection {
  @scala.inline
  def apply[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): GeometryCollection[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection[P]]
  }
}

