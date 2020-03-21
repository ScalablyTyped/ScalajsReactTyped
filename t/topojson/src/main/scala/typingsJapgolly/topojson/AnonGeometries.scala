package typingsJapgolly.topojson

import typingsJapgolly.topojson.topojsonStrings.GeometryCollection
import typingsJapgolly.topojsonSpecification.mod.MultiPolygon
import typingsJapgolly.topojsonSpecification.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometries extends js.Object {
  var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  var `type`: GeometryCollection
}

object AnonGeometries {
  @scala.inline
  def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]], `type`: GeometryCollection): AnonGeometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometries]
  }
}

