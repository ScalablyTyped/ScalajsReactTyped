package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wechatMiniprogram.DB.GeoPoint
  - typingsJapgolly.wechatMiniprogram.DB.GeoMultiPoint
  - typingsJapgolly.wechatMiniprogram.DB.GeoLineString
  - typingsJapgolly.wechatMiniprogram.DB.GeoMultiLineString
  - typingsJapgolly.wechatMiniprogram.DB.GeoPolygon
  - typingsJapgolly.wechatMiniprogram.DB.GeoMultiPolygon
*/
trait GeoInstance extends StObject
object GeoInstance {
  
  inline def GeoLineString(points: js.Array[GeoPoint], toJSON: CallbackTo[IGeoJSONLineString]): typingsJapgolly.wechatMiniprogram.DB.GeoLineString = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoLineString]
  }
  
  inline def GeoMultiLineString(lines: js.Array[GeoLineString], toJSON: CallbackTo[IGeoJSONMultiLineString]): typingsJapgolly.wechatMiniprogram.DB.GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoMultiLineString]
  }
  
  inline def GeoMultiPoint(points: js.Array[GeoPoint], toJSON: CallbackTo[IGeoJSONMultiPoint]): typingsJapgolly.wechatMiniprogram.DB.GeoMultiPoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoMultiPoint]
  }
  
  inline def GeoMultiPolygon(polygons: js.Array[GeoPolygon], toJSON: CallbackTo[IGeoJSONMultiPolygon]): typingsJapgolly.wechatMiniprogram.DB.GeoMultiPolygon = {
    val __obj = js.Dynamic.literal(polygons = polygons.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoMultiPolygon]
  }
  
  inline def GeoPoint(latitude: Double, longitude: Double, toJSON: CallbackTo[Record[String, Any]]): typingsJapgolly.wechatMiniprogram.DB.GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoPoint]
  }
  
  inline def GeoPolygon(lines: js.Array[GeoLineString], toJSON: CallbackTo[IGeoJSONPolygon]): typingsJapgolly.wechatMiniprogram.DB.GeoPolygon = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.GeoPolygon]
  }
}
