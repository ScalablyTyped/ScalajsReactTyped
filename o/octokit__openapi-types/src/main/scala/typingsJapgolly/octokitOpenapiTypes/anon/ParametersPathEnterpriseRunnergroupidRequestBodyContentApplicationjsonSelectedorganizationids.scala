package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedorganizationids
}
object ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupid,
    requestBody: ContentApplicationjsonSelectedorganizationids
  ): ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonSelectedorganizationids](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedorganizationids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
