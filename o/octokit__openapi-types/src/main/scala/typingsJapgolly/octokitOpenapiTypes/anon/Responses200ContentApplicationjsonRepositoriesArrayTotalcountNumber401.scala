package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 extends StObject {
  
  var parameters: Path619
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401`
}
object Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 {
  
  inline def apply(parameters: Path619, responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401`): Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRepositoriesArrayTotalcountNumber401](x: Self) {
    
    inline def setParameters(value: Path619): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
