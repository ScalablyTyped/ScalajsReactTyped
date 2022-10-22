package typingsJapgolly.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateOnExit extends StObject {
  
  /**
    * Specifies the action to take if all of the specified conditions (onStatusReason, onReason, and onExitCode) are met. The values aren't case sensitive.
    */
  var action: RetryAction
  
  /**
    * Contains a glob pattern to match against the decimal representation of the ExitCode returned for a job. The pattern can be up to 512 characters in length. It can contain only numbers, and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match. The string can be between 1 and 512 characters in length.
    */
  var onExitCode: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a glob pattern to match against the Reason returned for a job. The pattern can be up to 512 characters in length. It can contain letters, numbers, periods (.), colons (:), and white space (including spaces and tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match. The string can be between 1 and 512 characters in length.
    */
  var onReason: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a glob pattern to match against the StatusReason returned for a job. The pattern can be up to 512 characters in length. It can contain letters, numbers, periods (.), colons (:), and white space (including spaces or tabs). It can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match. The string can be between 1 and 512 characters in length.
    */
  var onStatusReason: js.UndefOr[String] = js.undefined
}
object EvaluateOnExit {
  
  inline def apply(action: RetryAction): EvaluateOnExit = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnExit]
  }
  
  extension [Self <: EvaluateOnExit](x: Self) {
    
    inline def setAction(value: RetryAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnExitCode(value: String): Self = StObject.set(x, "onExitCode", value.asInstanceOf[js.Any])
    
    inline def setOnExitCodeUndefined: Self = StObject.set(x, "onExitCode", js.undefined)
    
    inline def setOnReason(value: String): Self = StObject.set(x, "onReason", value.asInstanceOf[js.Any])
    
    inline def setOnReasonUndefined: Self = StObject.set(x, "onReason", js.undefined)
    
    inline def setOnStatusReason(value: String): Self = StObject.set(x, "onStatusReason", value.asInstanceOf[js.Any])
    
    inline def setOnStatusReasonUndefined: Self = StObject.set(x, "onStatusReason", js.undefined)
  }
}
