package typingsJapgolly.angularPlatformBrowser.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventManagerPlugin extends StObject {
  
  /* private */ var _doc: Any
  
  def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function
  
  def addGlobalEventListener(element: String, eventName: String, handler: js.Function): js.Function
  
  var manager: EventManager
  
  def supports(eventName: String): Boolean
}
object EventManagerPlugin {
  
  inline def apply(
    _doc: Any,
    addEventListener: (HTMLElement, String, js.Function) => js.Function,
    addGlobalEventListener: (String, String, js.Function) => js.Function,
    manager: EventManager,
    supports: String => Boolean
  ): EventManagerPlugin = {
    val __obj = js.Dynamic.literal(_doc = _doc.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction3(addEventListener), addGlobalEventListener = js.Any.fromFunction3(addGlobalEventListener), manager = manager.asInstanceOf[js.Any], supports = js.Any.fromFunction1(supports))
    __obj.asInstanceOf[EventManagerPlugin]
  }
  
  extension [Self <: EventManagerPlugin](x: Self) {
    
    inline def setAddEventListener(value: (HTMLElement, String, js.Function) => js.Function): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setAddGlobalEventListener(value: (String, String, js.Function) => js.Function): Self = StObject.set(x, "addGlobalEventListener", js.Any.fromFunction3(value))
    
    inline def setManager(value: EventManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: String => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
    
    inline def set_doc(value: Any): Self = StObject.set(x, "_doc", value.asInstanceOf[js.Any])
  }
}
