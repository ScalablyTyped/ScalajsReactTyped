package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjsonGithubownedallowed
}
object RequestBodyContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: PathEnterprise, requestBody: ContentApplicationjsonGithubownedallowed): RequestBodyContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGithubownedallowed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
