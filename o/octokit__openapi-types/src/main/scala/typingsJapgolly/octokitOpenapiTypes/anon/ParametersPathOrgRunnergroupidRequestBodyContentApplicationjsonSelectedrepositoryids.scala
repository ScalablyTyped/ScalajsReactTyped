package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathOrgRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
}
object ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(parameters: PathOrgRunnergroupid, requestBody: ContentApplicationjsonSelectedrepositoryids): ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
