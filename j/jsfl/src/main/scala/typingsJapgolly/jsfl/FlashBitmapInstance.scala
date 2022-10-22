package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if FlashElement.elementType == 'instance'
trait FlashBitmapInstance extends StObject {
  
  def getBits(): FlashBitmap
  
  var hPixels: Double
  
  def setBits(bitmap: FlashBitmap): Unit
  
  var vPixels: Double
}
object FlashBitmapInstance {
  
  inline def apply(
    getBits: CallbackTo[FlashBitmap],
    hPixels: Double,
    setBits: FlashBitmap => Callback,
    vPixels: Double
  ): FlashBitmapInstance = {
    val __obj = js.Dynamic.literal(getBits = getBits.toJsFn, hPixels = hPixels.asInstanceOf[js.Any], setBits = js.Any.fromFunction1((t0: FlashBitmap) => setBits(t0).runNow()), vPixels = vPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapInstance]
  }
  
  extension [Self <: FlashBitmapInstance](x: Self) {
    
    inline def setGetBits(value: CallbackTo[FlashBitmap]): Self = StObject.set(x, "getBits", value.toJsFn)
    
    inline def setHPixels(value: Double): Self = StObject.set(x, "hPixels", value.asInstanceOf[js.Any])
    
    inline def setSetBits(value: FlashBitmap => Callback): Self = StObject.set(x, "setBits", js.Any.fromFunction1((t0: FlashBitmap) => value(t0).runNow()))
    
    inline def setVPixels(value: Double): Self = StObject.set(x, "vPixels", value.asInstanceOf[js.Any])
  }
}
