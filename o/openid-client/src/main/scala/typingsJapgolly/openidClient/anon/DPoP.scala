package typingsJapgolly.openidClient.anon

import typingsJapgolly.openidClient.mod.DPoPInput
import typingsJapgolly.openidClient.openidClientStrings.GET
import typingsJapgolly.openidClient.openidClientStrings.POST
import typingsJapgolly.openidClient.openidClientStrings.body
import typingsJapgolly.openidClient.openidClientStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPoP extends StObject {
  
  var DPoP: js.UndefOr[DPoPInput] = js.undefined
  
  var method: js.UndefOr[GET | POST] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var tokenType: js.UndefOr[String] = js.undefined
  
  var via: js.UndefOr[header | body] = js.undefined
}
object DPoP {
  
  inline def apply(): DPoP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DPoP]
  }
  
  extension [Self <: DPoP](x: Self) {
    
    inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    
    inline def setVia(value: header | body): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
  }
}
