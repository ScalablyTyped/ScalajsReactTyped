package typingsJapgolly.zetapushJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStatusListener extends StObject {
  
  def onConnectionBroken(): Unit
  
  def onConnectionClosed(): Unit
  
  def onConnectionEstablished(): Unit
  
  def onConnectionToServerFail(failure: Any): Unit
  
  def onConnectionWillClose(): Unit
  
  def onFailedHandshake(failure: Any): Unit
  
  def onMessageLost(): Unit
  
  def onNegotiationFailed(failure: Any): Unit
  
  def onNoServerUrlAvailable(): Unit
  
  def onSuccessfulHandshake(authentication: Any): Unit
}
object ConnectionStatusListener {
  
  inline def apply(
    onConnectionBroken: Callback,
    onConnectionClosed: Callback,
    onConnectionEstablished: Callback,
    onConnectionToServerFail: Any => Callback,
    onConnectionWillClose: Callback,
    onFailedHandshake: Any => Callback,
    onMessageLost: Callback,
    onNegotiationFailed: Any => Callback,
    onNoServerUrlAvailable: Callback,
    onSuccessfulHandshake: Any => Callback
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = onConnectionBroken.toJsFn, onConnectionClosed = onConnectionClosed.toJsFn, onConnectionEstablished = onConnectionEstablished.toJsFn, onConnectionToServerFail = js.Any.fromFunction1((t0: Any) => onConnectionToServerFail(t0).runNow()), onConnectionWillClose = onConnectionWillClose.toJsFn, onFailedHandshake = js.Any.fromFunction1((t0: Any) => onFailedHandshake(t0).runNow()), onMessageLost = onMessageLost.toJsFn, onNegotiationFailed = js.Any.fromFunction1((t0: Any) => onNegotiationFailed(t0).runNow()), onNoServerUrlAvailable = onNoServerUrlAvailable.toJsFn, onSuccessfulHandshake = js.Any.fromFunction1((t0: Any) => onSuccessfulHandshake(t0).runNow()))
    __obj.asInstanceOf[ConnectionStatusListener]
  }
  
  extension [Self <: ConnectionStatusListener](x: Self) {
    
    inline def setOnConnectionBroken(value: Callback): Self = StObject.set(x, "onConnectionBroken", value.toJsFn)
    
    inline def setOnConnectionClosed(value: Callback): Self = StObject.set(x, "onConnectionClosed", value.toJsFn)
    
    inline def setOnConnectionEstablished(value: Callback): Self = StObject.set(x, "onConnectionEstablished", value.toJsFn)
    
    inline def setOnConnectionToServerFail(value: Any => Callback): Self = StObject.set(x, "onConnectionToServerFail", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnConnectionWillClose(value: Callback): Self = StObject.set(x, "onConnectionWillClose", value.toJsFn)
    
    inline def setOnFailedHandshake(value: Any => Callback): Self = StObject.set(x, "onFailedHandshake", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnMessageLost(value: Callback): Self = StObject.set(x, "onMessageLost", value.toJsFn)
    
    inline def setOnNegotiationFailed(value: Any => Callback): Self = StObject.set(x, "onNegotiationFailed", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnNoServerUrlAvailable(value: Callback): Self = StObject.set(x, "onNoServerUrlAvailable", value.toJsFn)
    
    inline def setOnSuccessfulHandshake(value: Any => Callback): Self = StObject.set(x, "onSuccessfulHandshake", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
