package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQueryLabelNameString extends StObject {
  
  var parameters: PathOwnerReleaseidQueryLabelNameString
  
  var requestBody: `179`
  
  var responses: `201Content573`
}
object ParametersPathOwnerReleaseidQueryLabelNameString {
  
  inline def apply(parameters: PathOwnerReleaseidQueryLabelNameString, requestBody: `179`, responses: `201Content573`): ParametersPathOwnerReleaseidQueryLabelNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQueryLabelNameString]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidQueryLabelNameString](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseidQueryLabelNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: `179`): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content573`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
