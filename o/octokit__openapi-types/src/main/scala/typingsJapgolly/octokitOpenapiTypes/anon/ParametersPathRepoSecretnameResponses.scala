package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoSecretnameResponses extends StObject {
  
  var parameters: PathRepoSecretname
}
object ParametersPathRepoSecretnameResponses {
  
  inline def apply(parameters: PathRepoSecretname): ParametersPathRepoSecretnameResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoSecretnameResponses]
  }
  
  extension [Self <: ParametersPathRepoSecretnameResponses](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
