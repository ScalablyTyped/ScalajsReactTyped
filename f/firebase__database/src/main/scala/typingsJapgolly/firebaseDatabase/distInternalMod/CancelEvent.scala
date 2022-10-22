package typingsJapgolly.firebaseDatabase.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEvent
  extends StObject
     with Event2 {
  
  var error: js.Error
  
  var eventRegistration: EventRegistration
  
  var path: Path
}
object CancelEvent {
  
  inline def apply(
    error: js.Error,
    eventRegistration: EventRegistration,
    getEventRunner: CallbackTo[js.Function0[Unit]],
    getEventType: CallbackTo[String],
    getPath: CallbackTo[Path],
    path: Path
  ): CancelEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], eventRegistration = eventRegistration.asInstanceOf[js.Any], getEventRunner = getEventRunner.toJsFn, getEventType = getEventType.toJsFn, getPath = getPath.toJsFn, path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEvent]
  }
  
  extension [Self <: CancelEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEventRegistration(value: EventRegistration): Self = StObject.set(x, "eventRegistration", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
