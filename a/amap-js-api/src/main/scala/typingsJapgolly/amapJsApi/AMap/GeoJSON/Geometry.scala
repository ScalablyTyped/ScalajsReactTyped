package typingsJapgolly.amapJsApi.AMap.GeoJSON

import typingsJapgolly.amapJsApi.amapJsApiStrings.GeometryCollection
import typingsJapgolly.amapJsApi.amapJsApiStrings.LineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiLineString
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPoint
import typingsJapgolly.amapJsApi.amapJsApiStrings.MultiPolygon
import typingsJapgolly.amapJsApi.amapJsApiStrings.Point
import typingsJapgolly.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApi.AnonCoordinates
  - typingsJapgolly.amapJsApi.AnonType
  - typingsJapgolly.amapJsApi.AnonCoordinatesType
  - typingsJapgolly.amapJsApi.AnonGeometries
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def AnonCoordinates(coordinates: js.Tuple2[Double, Double], `type`: Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def AnonType(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def AnonCoordinatesType(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def AnonGeometries(
    geometries: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.Geometry */ js.Object
    ],
    `type`: GeometryCollection
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

