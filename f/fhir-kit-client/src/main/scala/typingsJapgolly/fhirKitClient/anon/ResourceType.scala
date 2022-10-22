package typingsJapgolly.fhirKitClient.anon

import typingsJapgolly.fhirKitClient.mod.FhirResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceType[T /* <: FhirResource */] extends StObject {
  
  var body: T
  
  var headers: js.UndefOr[typingsJapgolly.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typingsJapgolly.request.mod.Options] = js.undefined
  
  var resourceType: typingsJapgolly.fhirKitClient.mod.ResourceType
}
object ResourceType {
  
  inline def apply[T /* <: FhirResource */](body: T, id: String, resourceType: typingsJapgolly.fhirKitClient.mod.ResourceType): ResourceType[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType[T]]
  }
  
  extension [Self <: ResourceType[?], T /* <: FhirResource */](x: Self & ResourceType[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typingsJapgolly.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
