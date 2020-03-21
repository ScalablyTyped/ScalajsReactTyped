package typingsJapgolly.amapJsApi

import typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry
import typingsJapgolly.amapJsApi.amapJsApiStrings.LineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPoint
import typingsJapgolly.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]]
  var `type`: MultiPoint | LineString | Polygon
}

object AnonType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): AnonType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

