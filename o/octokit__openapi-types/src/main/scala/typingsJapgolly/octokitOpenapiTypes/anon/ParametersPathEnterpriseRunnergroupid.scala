package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseRunnergroupid extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var responses: `200Content255`
}
object ParametersPathEnterpriseRunnergroupid {
  
  inline def apply(parameters: PathEnterpriseRunnergroupid, responses: `200Content255`): ParametersPathEnterpriseRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseRunnergroupid]
  }
  
  extension [Self <: ParametersPathEnterpriseRunnergroupid](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content255`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
