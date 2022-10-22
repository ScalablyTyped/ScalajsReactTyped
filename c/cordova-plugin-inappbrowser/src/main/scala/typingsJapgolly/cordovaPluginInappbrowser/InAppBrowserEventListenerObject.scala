package typingsJapgolly.cordovaPluginInappbrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppBrowserEventListenerObject extends StObject {
  
  def handleEvent(evt: InAppBrowserEvent): Unit
}
object InAppBrowserEventListenerObject {
  
  inline def apply(handleEvent: InAppBrowserEvent => Callback): InAppBrowserEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1((t0: InAppBrowserEvent) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[InAppBrowserEventListenerObject]
  }
  
  extension [Self <: InAppBrowserEventListenerObject](x: Self) {
    
    inline def setHandleEvent(value: InAppBrowserEvent => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: InAppBrowserEvent) => value(t0).runNow()))
  }
}
