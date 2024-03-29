package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200278404 extends StObject {
  
  var parameters: PathCommentidGistid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200278404`
}
object Responses200278404 {
  
  inline def apply(
    parameters: PathCommentidGistid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200278404`
  ): Responses200278404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200278404]
  }
  
  extension [Self <: Responses200278404](x: Self) {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200278404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
