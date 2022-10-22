package typingsJapgolly.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTInfoVerifyParams extends StObject {
  
  var data: js.typedarray.ArrayBuffer
  
  var notAfter: js.UndefOr[js.Date] = js.undefined
  
  var notBefore: js.UndefOr[js.Date] = js.undefined
}
object TSTInfoVerifyParams {
  
  inline def apply(data: js.typedarray.ArrayBuffer): TSTInfoVerifyParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfoVerifyParams]
  }
  
  extension [Self <: TSTInfoVerifyParams](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
