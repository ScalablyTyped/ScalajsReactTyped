package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID for which the action failed.
    */
  var UserId: js.UndefOr[NonEmptyString] = js.undefined
}
object UserError {
  
  inline def apply(): UserError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserError]
  }
  
  extension [Self <: UserError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
