package typingsJapgolly.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersId extends StObject {
  
  var headers: js.UndefOr[typingsJapgolly.request.mod.Headers] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[typingsJapgolly.request.mod.Options] = js.undefined
  
  var resourceType: js.UndefOr[typingsJapgolly.fhirKitClient.mod.ResourceType] = js.undefined
}
object HeadersId {
  
  inline def apply(): HeadersId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersId]
  }
  
  extension [Self <: HeadersId](x: Self) {
    
    inline def setHeaders(value: typingsJapgolly.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptions(value: typingsJapgolly.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
