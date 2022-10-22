package typingsJapgolly.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseResponse extends StObject {
  
  var response: org.scalajs.dom.Response
}
object ResponseResponse {
  
  inline def apply(response: org.scalajs.dom.Response): ResponseResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResponse]
  }
  
  extension [Self <: ResponseResponse](x: Self) {
    
    inline def setResponse(value: org.scalajs.dom.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
