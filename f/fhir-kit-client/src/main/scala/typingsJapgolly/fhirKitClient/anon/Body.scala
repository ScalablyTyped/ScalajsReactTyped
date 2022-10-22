package typingsJapgolly.fhirKitClient.anon

import typingsJapgolly.fhirKitClient.mod.FhirResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body[T /* <: FhirResource */] extends StObject {
  
  var body: T
  
  var headers: js.UndefOr[typingsJapgolly.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typingsJapgolly.request.mod.Options] = js.undefined
  
  var resourceType: typingsJapgolly.fhirKitClient.mod.ResourceType
}
object Body {
  
  inline def apply[T /* <: FhirResource */](body: T, resourceType: typingsJapgolly.fhirKitClient.mod.ResourceType): Body[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body[T]]
  }
  
  extension [Self <: Body[?], T /* <: FhirResource */](x: Self & Body[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typingsJapgolly.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typingsJapgolly.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
