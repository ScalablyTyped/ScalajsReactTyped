package typingsJapgolly.amapJsApi

import typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiLineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPolygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinatesType extends Geometry {
  var coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]
  var `type`: MultiLineString | MultiPolygon
}

object AnonCoordinatesType {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): AnonCoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinatesType]
  }
}

