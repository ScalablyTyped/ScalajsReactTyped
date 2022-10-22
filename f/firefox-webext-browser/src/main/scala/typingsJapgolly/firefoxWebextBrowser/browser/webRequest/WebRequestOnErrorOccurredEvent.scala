package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestOnErrorOccurredEvent[TCallback] extends StObject {
  
  def addListener(cb: TCallback, filter: RequestFilter): Unit
  
  def hasListener(cb: TCallback): Boolean
  
  def removeListener(cb: TCallback): Unit
}
object WebRequestOnErrorOccurredEvent {
  
  inline def apply[TCallback](
    addListener: (TCallback, RequestFilter) => Callback,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Callback
  ): WebRequestOnErrorOccurredEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: TCallback, t1: RequestFilter) => (addListener(t0, t1)).runNow()), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1((t0: TCallback) => removeListener(t0).runNow()))
    __obj.asInstanceOf[WebRequestOnErrorOccurredEvent[TCallback]]
  }
  
  extension [Self <: WebRequestOnErrorOccurredEvent[?], TCallback](x: Self & WebRequestOnErrorOccurredEvent[TCallback]) {
    
    inline def setAddListener(value: (TCallback, RequestFilter) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: TCallback, t1: RequestFilter) => (value(t0, t1)).runNow()))
    
    inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    inline def setRemoveListener(value: TCallback => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: TCallback) => value(t0).runNow()))
  }
}
