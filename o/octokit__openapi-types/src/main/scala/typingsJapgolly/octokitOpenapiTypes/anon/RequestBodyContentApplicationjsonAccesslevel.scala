package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccesslevel extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonAccesslevel
}
object RequestBodyContentApplicationjsonAccesslevel {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonAccesslevel): RequestBodyContentApplicationjsonAccesslevel = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccesslevel]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAccesslevel](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesslevel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
