package typingsJapgolly.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTimedOutEventDetails extends StObject {
  
  /**
    * A more detailed explanation of the cause of the timeout.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
}
object ExecutionTimedOutEventDetails {
  
  inline def apply(): ExecutionTimedOutEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionTimedOutEventDetails]
  }
  
  extension [Self <: ExecutionTimedOutEventDetails](x: Self) {
    
    inline def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
