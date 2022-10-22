package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSecretname extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200ContentApplicationjsonCreatedatName`
}
object ParametersPathRepoSecretname {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200ContentApplicationjsonCreatedatName`): ParametersPathRepoSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSecretname]
  }
  
  extension [Self <: ParametersPathRepoSecretname](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatName`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
