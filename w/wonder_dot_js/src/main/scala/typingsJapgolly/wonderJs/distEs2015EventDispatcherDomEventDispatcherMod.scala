package typingsJapgolly.wonderJs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.wonderJs.distEs2015EventDispatcherEventDispatcherMod.EventDispatcher
import typingsJapgolly.wonderJs.distEs2015EventObjectEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventDispatcherDomEventDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", "DomEventDispatcher")
  @js.native
  open class DomEventDispatcher () extends EventDispatcher {
    
    def trigger(dom: HTMLElement, event: Event): Unit = js.native
    def trigger(event: Event): Unit = js.native
  }
  /* static members */
  object DomEventDispatcher {
    
    @JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", "DomEventDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
