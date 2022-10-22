package typingsJapgolly.unsplashJs.anon

import typingsJapgolly.unsplashJs.distHelpersResponseMod.ApiResponse
import typingsJapgolly.unsplashJs.unsplashJsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalResponse[T]
  extends StObject
     with ApiResponse[T] {
  
  var errors: js.UndefOr[scala.Nothing] = js.undefined
  
  var originalResponse: org.scalajs.dom.Response
  
  var response: T
  
  var status: Double
  
  var `type`: success
}
object OriginalResponse {
  
  inline def apply[T](originalResponse: org.scalajs.dom.Response, response: T, status: Double): OriginalResponse[T] = {
    val __obj = js.Dynamic.literal(originalResponse = originalResponse.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[OriginalResponse[T]]
  }
  
  extension [Self <: OriginalResponse[?], T](x: Self & OriginalResponse[T]) {
    
    inline def setOriginalResponse(value: org.scalajs.dom.Response): Self = StObject.set(x, "originalResponse", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: T): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
