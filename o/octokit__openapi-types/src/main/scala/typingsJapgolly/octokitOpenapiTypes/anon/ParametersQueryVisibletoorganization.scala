package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryVisibletoorganization extends StObject {
  
  var parameters: QueryVisibletoorganization
  
  var responses: `200ContentApplicationjsonRunnergroupsArray`
}
object ParametersQueryVisibletoorganization {
  
  inline def apply(parameters: QueryVisibletoorganization, responses: `200ContentApplicationjsonRunnergroupsArray`): ParametersQueryVisibletoorganization = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryVisibletoorganization]
  }
  
  extension [Self <: ParametersQueryVisibletoorganization](x: Self) {
    
    inline def setParameters(value: QueryVisibletoorganization): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnergroupsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
