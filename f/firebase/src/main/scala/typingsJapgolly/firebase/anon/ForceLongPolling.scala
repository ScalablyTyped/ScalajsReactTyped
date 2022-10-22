package typingsJapgolly.firebase.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceLongPolling extends StObject {
  
  /**
    * Force the use of long polling instead of WebSockets. This will be ignored if the WebSocket protocol is used in `databaseURL`.
    */
  def forceLongPolling(): Unit
  
  /**
    * Force the use of WebSockets instead of long polling.
    */
  def forceWebSockets(): Unit
}
object ForceLongPolling {
  
  inline def apply(forceLongPolling: Callback, forceWebSockets: Callback): ForceLongPolling = {
    val __obj = js.Dynamic.literal(forceLongPolling = forceLongPolling.toJsFn, forceWebSockets = forceWebSockets.toJsFn)
    __obj.asInstanceOf[ForceLongPolling]
  }
  
  extension [Self <: ForceLongPolling](x: Self) {
    
    inline def setForceLongPolling(value: Callback): Self = StObject.set(x, "forceLongPolling", value.toJsFn)
    
    inline def setForceWebSockets(value: Callback): Self = StObject.set(x, "forceWebSockets", value.toJsFn)
  }
}
