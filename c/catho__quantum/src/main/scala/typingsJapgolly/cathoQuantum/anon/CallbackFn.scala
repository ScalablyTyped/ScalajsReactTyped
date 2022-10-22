package typingsJapgolly.cathoQuantum.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackFn extends StObject {
  
  var callbackFn: (MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]) | (TouchEventHandler[HTMLButtonElement | HTMLAnchorElement])
  
  var title: String
}
object CallbackFn {
  
  inline def apply(
    callbackFn: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) => Callback,
    title: String
  ): CallbackFn = {
    val __obj = js.Dynamic.literal(callbackFn = js.Any.fromFunction1((t0: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element])) => callbackFn(t0).runNow()), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackFn]
  }
  
  extension [Self <: CallbackFn](x: Self) {
    
    inline def setCallbackFn(
      value: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) => Callback
    ): Self = StObject.set(x, "callbackFn", js.Any.fromFunction1((t0: (ReactMouseEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element]) | (ReactTouchEventFrom[(HTMLButtonElement | HTMLAnchorElement) & Element])) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
