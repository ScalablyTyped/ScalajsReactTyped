package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySubjectid extends StObject {
  
  var parameters: QuerySubjectid
  
  var responses: `200ContentApplicationjsonContextsArray`
}
object ParametersQuerySubjectid {
  
  inline def apply(parameters: QuerySubjectid, responses: `200ContentApplicationjsonContextsArray`): ParametersQuerySubjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySubjectid]
  }
  
  extension [Self <: ParametersQuerySubjectid](x: Self) {
    
    inline def setParameters(value: QuerySubjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContextsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
