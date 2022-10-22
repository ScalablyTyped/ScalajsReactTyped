package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.maplibreGlStrings.GET
import typingsJapgolly.maplibreGl.maplibreGlStrings.POST
import typingsJapgolly.maplibreGl.maplibreGlStrings.PUT
import typingsJapgolly.maplibreGl.maplibreGlStrings.`same-origin`
import typingsJapgolly.maplibreGl.maplibreGlStrings.arrayBuffer
import typingsJapgolly.maplibreGl.maplibreGlStrings.include
import typingsJapgolly.maplibreGl.maplibreGlStrings.json
import typingsJapgolly.maplibreGl.maplibreGlStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestParameters extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
  
  var credentials: js.UndefOr[`same-origin` | include] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var method: js.UndefOr[GET | POST | PUT] = js.undefined
  
  var `type`: js.UndefOr[string | json | arrayBuffer] = js.undefined
  
  var url: String
}
object RequestParameters {
  
  inline def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  
  extension [Self <: RequestParameters](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    inline def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
    
    inline def setCredentials(value: `same-origin` | include): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setType(value: string | json | arrayBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
