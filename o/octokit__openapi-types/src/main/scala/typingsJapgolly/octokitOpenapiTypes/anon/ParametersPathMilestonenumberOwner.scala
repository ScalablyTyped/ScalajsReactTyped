package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwner extends StObject {
  
  var parameters: PathMilestonenumberOwner
  
  var responses: `200547`
}
object ParametersPathMilestonenumberOwner {
  
  inline def apply(parameters: PathMilestonenumberOwner, responses: `200547`): ParametersPathMilestonenumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwner]
  }
  
  extension [Self <: ParametersPathMilestonenumberOwner](x: Self) {
    
    inline def setParameters(value: PathMilestonenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200547`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
