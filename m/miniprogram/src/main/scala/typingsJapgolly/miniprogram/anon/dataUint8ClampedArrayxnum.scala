package typingsJapgolly.miniprogram.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :std.Uint8ClampedArray,   x :number,   y :number,   width :number,   height :number} & miniprogram.AsyncCallback<void> */
trait dataUint8ClampedArrayxnum extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.typedarray.Uint8ClampedArray
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var height: Double
  
  var success: js.UndefOr[js.Function1[/* res */ Unit, Unit]] = js.undefined
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object dataUint8ClampedArrayxnum {
  
  inline def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double, x: Double, y: Double): dataUint8ClampedArrayxnum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[dataUint8ClampedArrayxnum]
  }
  
  extension [Self <: dataUint8ClampedArrayxnum](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* err */ AsyncCallbackFailObject) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Unit => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Unit) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
