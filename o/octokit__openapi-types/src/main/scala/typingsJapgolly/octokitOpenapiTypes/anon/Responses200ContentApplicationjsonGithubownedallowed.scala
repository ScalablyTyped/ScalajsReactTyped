package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonGithubownedallowed extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `200ContentApplicationjsonGithubownedallowed`
}
object Responses200ContentApplicationjsonGithubownedallowed {
  
  inline def apply(parameters: PathEnterprise, responses: `200ContentApplicationjsonGithubownedallowed`): Responses200ContentApplicationjsonGithubownedallowed = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonGithubownedallowed]
  }
  
  extension [Self <: Responses200ContentApplicationjsonGithubownedallowed](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonGithubownedallowed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
