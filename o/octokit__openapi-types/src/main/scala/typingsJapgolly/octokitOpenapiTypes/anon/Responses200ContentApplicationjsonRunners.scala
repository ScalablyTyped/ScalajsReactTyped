package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRunners extends StObject {
  
  var parameters: PathRunnergroupidQueryPage
  
  var responses: `200ContentApplicationjsonRunners`
}
object Responses200ContentApplicationjsonRunners {
  
  inline def apply(parameters: PathRunnergroupidQueryPage, responses: `200ContentApplicationjsonRunners`): Responses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setParameters(value: PathRunnergroupidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
