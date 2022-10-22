package typingsJapgolly.semanticUiReactEventStack

import org.scalajs.dom.Event
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.CallableEventListener
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.EventListeners
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesLibEventPoolMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EventPool {
    def this(
      poolName: String,
      handlerSets: Map[String, typingsJapgolly.semanticUiReactEventStack.libTypesLibEventSetMod.default]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createByType(poolName: String, eventType: String, eventHandlers: js.Array[CallableEventListener]): EventPool = (^.asInstanceOf[js.Dynamic].applyDynamic("createByType")(poolName.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], eventHandlers.asInstanceOf[js.Any])).asInstanceOf[EventPool]
  }
  
  @js.native
  trait EventPool extends StObject {
    
    def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
    
    def dispatchEvent(eventType: String, event: Event): Unit = js.native
    
    /* private */ val handlerSets: Any = js.native
    
    def hasHandlers(): Boolean = js.native
    def hasHandlers(eventType: String): Boolean = js.native
    
    /* private */ val poolName: Any = js.native
    
    def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
  }
}
