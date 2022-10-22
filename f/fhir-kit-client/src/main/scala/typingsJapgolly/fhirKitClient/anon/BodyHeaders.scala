package typingsJapgolly.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyHeaders extends StObject {
  
  var body: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & Type
  
  var headers: js.UndefOr[typingsJapgolly.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typingsJapgolly.request.mod.Options] = js.undefined
}
object BodyHeaders {
  
  inline def apply(
    body: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & Type
  ): BodyHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyHeaders]
  }
  
  extension [Self <: BodyHeaders](x: Self) {
    
    inline def setBody(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify fhir.Bundle */ Any) & Type
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typingsJapgolly.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typingsJapgolly.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
