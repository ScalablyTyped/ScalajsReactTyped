package typingsJapgolly.rcFieldForm.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidateMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Len extends StObject {
  
  var len: js.UndefOr[ValidateMessage] = js.undefined
  
  var max: js.UndefOr[ValidateMessage] = js.undefined
  
  var min: js.UndefOr[ValidateMessage] = js.undefined
  
  var range: js.UndefOr[ValidateMessage] = js.undefined
}
object Len {
  
  inline def apply(): Len = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Len]
  }
  
  extension [Self <: Len](x: Self) {
    
    inline def setLen(value: ValidateMessage): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "len", value.toJsFn)
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setMax(value: ValidateMessage): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "max", value.toJsFn)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: ValidateMessage): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "min", value.toJsFn)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRange(value: ValidateMessage): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeCallbackTo(value: CallbackTo[String]): Self = StObject.set(x, "range", value.toJsFn)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
