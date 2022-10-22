package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventTarget extends StObject {
  
  /* private */ @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: IEventTarget
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
  
  def dispatchEvent(evt: IDOMEvent): Boolean
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit
}
object IEventTarget {
  
  inline def apply(
    MSHTMLDotIEventTarget_typekey: IEventTarget,
    addEventListener: (String, Any, Boolean) => Callback,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, Any, Boolean) => Callback
  ): IEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (addEventListener(t0, t1, t2)).runNow()), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (removeEventListener(t0, t1, t2)).runNow()))
    __obj.updateDynamic("MSHTML.IEventTarget_typekey")(MSHTMLDotIEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventTarget]
  }
  
  extension [Self <: IEventTarget](x: Self) {
    
    inline def setAddEventListener(value: (String, Any, Boolean) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setDispatchEvent(value: IDOMEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotIEventTarget_typekey(value: IEventTarget): Self = StObject.set(x, "MSHTML.IEventTarget_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, Any, Boolean) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3((t0: String, t1: Any, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
