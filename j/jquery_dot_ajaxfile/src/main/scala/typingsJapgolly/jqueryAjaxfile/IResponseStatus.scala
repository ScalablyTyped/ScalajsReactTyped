package typingsJapgolly.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponseStatus extends StObject {
  
  var code: Double
  
  var isSuccess: Boolean
  
  var text: String
}
object IResponseStatus {
  
  inline def apply(code: Double, isSuccess: Boolean, text: String): IResponseStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseStatus]
  }
  
  extension [Self <: IResponseStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
