package typingsJapgolly.openidClient.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.openidClient.mod.DPoPInput
import typingsJapgolly.openidClient.openidClientStrings.DELETE
import typingsJapgolly.openidClient.openidClientStrings.GET
import typingsJapgolly.openidClient.openidClientStrings.HEAD
import typingsJapgolly.openidClient.openidClientStrings.OPTIONS
import typingsJapgolly.openidClient.openidClientStrings.PATCH
import typingsJapgolly.openidClient.openidClientStrings.POST
import typingsJapgolly.openidClient.openidClientStrings.PUT
import typingsJapgolly.openidClient.openidClientStrings.TRACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var DPoP: js.UndefOr[DPoPInput] = js.undefined
  
  var body: js.UndefOr[String | Buffer] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE | PATCH] = js.undefined
  
  var tokenType: js.UndefOr[String] = js.undefined
}
object Body {
  
  inline def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
  }
}
