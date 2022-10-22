package typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateHistory extends StObject {
  
  /** The teacher or student who made the change. */
  var actorUserId: js.UndefOr[String] = js.undefined
  
  /** The workflow pipeline stage. */
  var state: js.UndefOr[String] = js.undefined
  
  /** When the submission entered this state. */
  var stateTimestamp: js.UndefOr[String] = js.undefined
}
object StateHistory {
  
  inline def apply(): StateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateHistory]
  }
  
  extension [Self <: StateHistory](x: Self) {
    
    inline def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    inline def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateTimestamp(value: String): Self = StObject.set(x, "stateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStateTimestampUndefined: Self = StObject.set(x, "stateTimestamp", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
