package typingsJapgolly.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPoint
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPoint
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONLineString
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiLineString
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPolygon
  - typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPolygon
*/
trait IGeoJSONObject extends StObject
object IGeoJSONObject {
  
  inline def IGeoJSONLineString(coordinates: js.Array[js.Tuple2[Double, Double]]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LineString")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONLineString]
  }
  
  inline def IGeoJSONMultiLineString(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiLineString")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiLineString]
  }
  
  inline def IGeoJSONMultiPoint(coordinates: js.Array[js.Tuple2[Double, Double]]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPoint")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPoint]
  }
  
  inline def IGeoJSONMultiPolygon(coordinates: js.Array[js.Array[js.Array[js.Tuple2[Double, Double]]]]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MultiPolygon")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONMultiPolygon]
  }
  
  inline def IGeoJSONPoint(coordinates: js.Tuple2[Double, Double]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Point")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPoint]
  }
  
  inline def IGeoJSONPolygon(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]]): typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Polygon")
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.DB.IGeoJSONPolygon]
  }
}
