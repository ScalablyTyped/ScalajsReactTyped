package typingsJapgolly.webgl2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmap extends StObject {
  
  def close(): Unit
  
  val height: Double
  
  val width: Double
}
object ImageBitmap {
  
  inline def apply(close: Callback, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
  
  extension [Self <: ImageBitmap](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
