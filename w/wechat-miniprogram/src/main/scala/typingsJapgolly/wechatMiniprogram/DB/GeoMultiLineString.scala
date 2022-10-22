package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoMultiLineString
  extends StObject
     with GeoInstance {
  
  var lines: js.Array[GeoLineString]
  
  def toJSON(): IGeoJSONMultiLineString
}
object GeoMultiLineString {
  
  inline def apply(lines: js.Array[GeoLineString], toJSON: CallbackTo[IGeoJSONMultiLineString]): GeoMultiLineString = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[GeoMultiLineString]
  }
  
  extension [Self <: GeoMultiLineString](x: Self) {
    
    inline def setLines(value: js.Array[GeoLineString]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: GeoLineString*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setToJSON(value: CallbackTo[IGeoJSONMultiLineString]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
