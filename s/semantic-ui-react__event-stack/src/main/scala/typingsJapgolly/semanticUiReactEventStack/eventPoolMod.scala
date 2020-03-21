package typingsJapgolly.semanticUiReactEventStack

import typingsJapgolly.semanticUiReactEventStack.typesMod.CallableEventListener
import typingsJapgolly.semanticUiReactEventStack.typesMod.EventListeners
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Namespace)
@js.native
object eventPoolMod extends js.Object {
  @js.native
  trait EventPool extends js.Object {
    val handlerSets: js.Any = js.native
    val poolName: js.Any = js.native
    def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
    def dispatchEvent(eventType: String, event: Event_): Unit = js.native
    def hasHandlers(): Boolean = js.native
    def hasHandlers(eventType: String): Boolean = js.native
    def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
  }
  
  @js.native
  class default protected () extends EventPool {
    def this(
      poolName: String,
      handlerSets: Map[String, typingsJapgolly.semanticUiReactEventStack.eventSetMod.default]
    ) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def createByType(poolName: String, eventType: String, eventHandlers: js.Array[CallableEventListener]): EventPool = js.native
  }
  
}

