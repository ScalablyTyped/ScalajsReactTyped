package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowedactionsEnabledorganizations extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonAllowedactionsEnabledorganizations
}
object RequestBodyContentApplicationjsonAllowedactionsEnabledorganizations {
  
  inline def apply(parameters: PathEnterprise, requestBody: ContentApplicationjsonAllowedactionsEnabledorganizations): RequestBodyContentApplicationjsonAllowedactionsEnabledorganizations = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowedactionsEnabledorganizations]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAllowedactionsEnabledorganizations](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowedactionsEnabledorganizations): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
