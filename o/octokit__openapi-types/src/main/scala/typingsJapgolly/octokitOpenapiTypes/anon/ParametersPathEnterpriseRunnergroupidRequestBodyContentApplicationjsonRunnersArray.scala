package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var requestBody: ContentApplicationjsonRunnersArray
}
object ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray {
  
  inline def apply(parameters: PathEnterpriseRunnergroupid, requestBody: ContentApplicationjsonRunnersArray): ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRunnersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
