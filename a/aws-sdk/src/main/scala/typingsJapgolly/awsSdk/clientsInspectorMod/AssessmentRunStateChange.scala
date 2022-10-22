package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentRunStateChange extends StObject {
  
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState
  
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: js.Date
}
object AssessmentRunStateChange {
  
  inline def apply(state: AssessmentRunState, stateChangedAt: js.Date): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
  
  extension [Self <: AssessmentRunStateChange](x: Self) {
    
    inline def setState(value: AssessmentRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateChangedAt(value: js.Date): Self = StObject.set(x, "stateChangedAt", value.asInstanceOf[js.Any])
  }
}
