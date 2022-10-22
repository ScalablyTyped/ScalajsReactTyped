package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[LaunchTemplateErrorCode] = js.undefined
  
  /**
    * The error message, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ResponseError {
  
  inline def apply(): ResponseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseError]
  }
  
  extension [Self <: ResponseError](x: Self) {
    
    inline def setCode(value: LaunchTemplateErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
