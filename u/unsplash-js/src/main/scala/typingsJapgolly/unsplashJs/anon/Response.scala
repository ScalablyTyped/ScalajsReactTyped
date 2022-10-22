package typingsJapgolly.unsplashJs.anon

import typingsJapgolly.unsplashJs.distHelpersErrorsMod.ErrorSource
import typingsJapgolly.unsplashJs.distHelpersResponseMod.ApiResponse
import typingsJapgolly.unsplashJs.unsplashJsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response
  extends StObject
     with ApiResponse[Any] {
  
  var errors: typingsJapgolly.unsplashJs.distHelpersErrorsMod.Errors
  
  var originalResponse: org.scalajs.dom.Response
  
  var response: js.UndefOr[scala.Nothing] = js.undefined
  
  var source: ErrorSource
  
  var status: Double
  
  var `type`: error
}
object Response {
  
  inline def apply(
    errors: typingsJapgolly.unsplashJs.distHelpersErrorsMod.Errors,
    originalResponse: org.scalajs.dom.Response,
    source: ErrorSource,
    status: Double
  ): Response = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], originalResponse = originalResponse.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setErrors(value: typingsJapgolly.unsplashJs.distHelpersErrorsMod.Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setOriginalResponse(value: org.scalajs.dom.Response): Self = StObject.set(x, "originalResponse", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
