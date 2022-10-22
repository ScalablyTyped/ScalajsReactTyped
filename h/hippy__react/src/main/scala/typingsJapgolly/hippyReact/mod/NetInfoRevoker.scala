package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetInfoRevoker extends StObject {
  
  var eventName: String
  
  var listener: js.UndefOr[NetworkInfoCallback] = js.undefined
}
object NetInfoRevoker {
  
  inline def apply(eventName: String): NetInfoRevoker = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetInfoRevoker]
  }
  
  extension [Self <: NetInfoRevoker](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setListener(value: /* data */ NetworkChangeEventData => Callback): Self = StObject.set(x, "listener", js.Any.fromFunction1((t0: /* data */ NetworkChangeEventData) => value(t0).runNow()))
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
  }
}
