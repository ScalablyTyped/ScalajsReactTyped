package typingsJapgolly.addDomEventListener

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: Document, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  inline def apply(target: HTMLElement, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  inline def apply(target: Window, eventType: String, callback: js.Function1[/* event */ Any, Any]): Listener = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Listener]
  
  @JSImport("add-dom-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Listener extends StObject {
    
    def remove(): Unit
  }
  object Listener {
    
    inline def apply(remove: Callback): Listener = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn)
      __obj.asInstanceOf[Listener]
    }
    
    extension [Self <: Listener](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
