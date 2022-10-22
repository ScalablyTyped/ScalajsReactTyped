package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmap extends StObject {
  
  /** Releases imageBitmap's underlying bitmap data. */
  /* standard dom */
  def close(): Unit
  
  /** Returns the intrinsic height of the image, in CSS pixels. */
  /* standard dom */
  val height: Double
  
  /** Returns the intrinsic width of the image, in CSS pixels. */
  /* standard dom */
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
