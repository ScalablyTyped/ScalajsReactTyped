package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameRepositoryidSecretnameResponses extends StObject {
  
  var parameters: PathEnvironmentnameRepositoryidSecretname
}
object ParametersPathEnvironmentnameRepositoryidSecretnameResponses {
  
  inline def apply(parameters: PathEnvironmentnameRepositoryidSecretname): ParametersPathEnvironmentnameRepositoryidSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameRepositoryidSecretnameResponses]
  }
  
  extension [Self <: ParametersPathEnvironmentnameRepositoryidSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
