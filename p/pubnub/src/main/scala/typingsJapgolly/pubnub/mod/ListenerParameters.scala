package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// addListener
trait ListenerParameters extends StObject {
  
  var file: js.UndefOr[js.Function1[/* fileEvent */ FileEvent, Unit]] = js.undefined
  
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.undefined
  
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.undefined
  
  var objects: js.UndefOr[
    js.Function1[/* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom], Unit]
  ] = js.undefined
  
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.undefined
  
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.undefined
  
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.undefined
}
object ListenerParameters {
  
  inline def apply(): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerParameters]
  }
  
  extension [Self <: ListenerParameters](x: Self) {
    
    inline def setFile(value: /* fileEvent */ FileEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "file", js.Any.fromFunction1((t0: /* fileEvent */ FileEvent) => value(t0).runNow()))
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setMessage(value: /* messageEvent */ MessageEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: /* messageEvent */ MessageEvent) => value(t0).runNow()))
    
    inline def setMessageAction(value: /* messageActionEvent */ MessageActionEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "messageAction", js.Any.fromFunction1((t0: /* messageActionEvent */ MessageActionEvent) => value(t0).runNow()))
    
    inline def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setObjects(
      value: /* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "objects", js.Any.fromFunction1((t0: /* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom]) => value(t0).runNow()))
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setPresence(value: /* presenceEvent */ PresenceEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "presence", js.Any.fromFunction1((t0: /* presenceEvent */ PresenceEvent) => value(t0).runNow()))
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setSignal(value: /* signalEvent */ SignalEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "signal", js.Any.fromFunction1((t0: /* signalEvent */ SignalEvent) => value(t0).runNow()))
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStatus(value: /* statusEvent */ StatusEvent => japgolly.scalajs.react.Callback): Self = StObject.set(x, "status", js.Any.fromFunction1((t0: /* statusEvent */ StatusEvent) => value(t0).runNow()))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
