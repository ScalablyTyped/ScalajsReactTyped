package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunneridResponses extends StObject {
  
  var parameters: PathOrgRunnerid
}
object ParametersPathOrgRunneridResponses {
  
  inline def apply(parameters: PathOrgRunnerid): ParametersPathOrgRunneridResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunneridResponses]
  }
  
  extension [Self <: ParametersPathOrgRunneridResponses](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
