package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleState
  extends StObject
     with State {
  
  var completed: js.UndefOr[CompletedDrag] = js.undefined
  
  var phase: IDLE
  
  var shouldFlush: Boolean
}
object IdleState {
  
  inline def apply(shouldFlush: Boolean): IdleState = {
    val __obj = js.Dynamic.literal(phase = "IDLE", shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
  
  extension [Self <: IdleState](x: Self) {
    
    inline def setCompleted(value: CompletedDrag): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setPhase(value: IDLE): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setShouldFlush(value: Boolean): Self = StObject.set(x, "shouldFlush", value.asInstanceOf[js.Any])
  }
}
