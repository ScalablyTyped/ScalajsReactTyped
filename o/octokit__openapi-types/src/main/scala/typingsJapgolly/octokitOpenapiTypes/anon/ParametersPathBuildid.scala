package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBuildid extends StObject {
  
  var parameters: PathBuildid
  
  var responses: `200ContentApplicationjsonError`
}
object ParametersPathBuildid {
  
  inline def apply(parameters: PathBuildid, responses: `200ContentApplicationjsonError`): ParametersPathBuildid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBuildid]
  }
  
  extension [Self <: ParametersPathBuildid](x: Self) {
    
    inline def setParameters(value: PathBuildid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonError`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
