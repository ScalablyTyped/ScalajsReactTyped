package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.idle.IdleState
import typingsJapgolly.chrome.chrome.idle.IdleStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofidle extends StObject {
  
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit
  
  var onStateChanged: IdleStateChangedEvent
  
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit
  
  def setDetectionInterval(intervalInSeconds: Double): Unit
}
object Typeofidle {
  
  inline def apply(
    getAutoLockDelay: js.Function1[/* delay */ Double, Unit] => Callback,
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ IdleState, Unit]) => Callback,
    setDetectionInterval: Double => Callback
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(getAutoLockDelay = js.Any.fromFunction1((t0: js.Function1[/* delay */ Double, Unit]) => getAutoLockDelay(t0).runNow()), onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* newState */ IdleState, Unit]) => (queryState(t0, t1)).runNow()), setDetectionInterval = js.Any.fromFunction1((t0: Double) => setDetectionInterval(t0).runNow()))
    __obj.asInstanceOf[Typeofidle]
  }
  
  extension [Self <: Typeofidle](x: Self) {
    
    inline def setGetAutoLockDelay(value: js.Function1[/* delay */ Double, Unit] => Callback): Self = StObject.set(x, "getAutoLockDelay", js.Any.fromFunction1((t0: js.Function1[/* delay */ Double, Unit]) => value(t0).runNow()))
    
    inline def setOnStateChanged(value: IdleStateChangedEvent): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
    
    inline def setQueryState(value: (Double, js.Function1[/* newState */ IdleState, Unit]) => Callback): Self = StObject.set(x, "queryState", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* newState */ IdleState, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSetDetectionInterval(value: Double => Callback): Self = StObject.set(x, "setDetectionInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
