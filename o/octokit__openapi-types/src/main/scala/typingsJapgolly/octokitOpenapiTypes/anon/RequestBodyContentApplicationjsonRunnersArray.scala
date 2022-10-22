package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRunnersArray extends StObject {
  
  var parameters: PathRunnergroupid
  
  var requestBody: ContentApplicationjsonRunnersArray
}
object RequestBodyContentApplicationjsonRunnersArray {
  
  inline def apply(parameters: PathRunnergroupid, requestBody: ContentApplicationjsonRunnersArray): RequestBodyContentApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRunnersArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRunnersArray](x: Self) {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRunnersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
