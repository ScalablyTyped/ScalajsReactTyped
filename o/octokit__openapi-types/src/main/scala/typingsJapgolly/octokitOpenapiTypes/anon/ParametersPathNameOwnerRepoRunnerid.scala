package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOwnerRepoRunnerid extends StObject {
  
  var parameters: PathNameOwnerRepoRunnerid
  
  var responses: `262`
}
object ParametersPathNameOwnerRepoRunnerid {
  
  inline def apply(parameters: PathNameOwnerRepoRunnerid, responses: `262`): ParametersPathNameOwnerRepoRunnerid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOwnerRepoRunnerid]
  }
  
  extension [Self <: ParametersPathNameOwnerRepoRunnerid](x: Self) {
    
    inline def setParameters(value: PathNameOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `262`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
