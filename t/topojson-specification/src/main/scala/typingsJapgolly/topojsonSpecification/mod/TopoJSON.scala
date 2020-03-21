package typingsJapgolly.topojsonSpecification.mod

import typingsJapgolly.geojson.mod.BBox
import typingsJapgolly.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoJSON extends js.Object {
  var bbox: js.UndefOr[BBox] = js.undefined
  var `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null
}

object TopoJSON {
  @scala.inline
  def apply(
    bbox: BBox = null,
    `type`: typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes = null
  ): TopoJSON = {
    val __obj = js.Dynamic.literal()
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopoJSON]
  }
}

