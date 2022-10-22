package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureDetails extends StObject {
  
  /**
    * Detailed information about the Automation step failure.
    */
  var Details: js.UndefOr[AutomationParameterMap] = js.undefined
  
  /**
    * The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.
    */
  var FailureStage: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.
    */
  var FailureType: js.UndefOr[String] = js.undefined
}
object FailureDetails {
  
  inline def apply(): FailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetails]
  }
  
  extension [Self <: FailureDetails](x: Self) {
    
    inline def setDetails(value: AutomationParameterMap): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setFailureStage(value: String): Self = StObject.set(x, "FailureStage", value.asInstanceOf[js.Any])
    
    inline def setFailureStageUndefined: Self = StObject.set(x, "FailureStage", js.undefined)
    
    inline def setFailureType(value: String): Self = StObject.set(x, "FailureType", value.asInstanceOf[js.Any])
    
    inline def setFailureTypeUndefined: Self = StObject.set(x, "FailureType", js.undefined)
  }
}
