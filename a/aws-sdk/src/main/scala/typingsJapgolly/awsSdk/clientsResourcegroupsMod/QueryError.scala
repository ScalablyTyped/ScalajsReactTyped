package typingsJapgolly.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryError extends StObject {
  
  /**
    * Possible values are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined
  
  /**
    * A message that explains the ErrorCode value. Messages might state that the specified CloudFormation stack does not exist (or no longer exists). For CLOUDFORMATION_STACK_INACTIVE, the message typically states that the CloudFormation stack has a status that is not (or no longer) active, such as CREATE_FAILED.
    */
  var Message: js.UndefOr[QueryErrorMessage] = js.undefined
}
object QueryError {
  
  inline def apply(): QueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryError]
  }
  
  extension [Self <: QueryError](x: Self) {
    
    inline def setErrorCode(value: QueryErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setMessage(value: QueryErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
