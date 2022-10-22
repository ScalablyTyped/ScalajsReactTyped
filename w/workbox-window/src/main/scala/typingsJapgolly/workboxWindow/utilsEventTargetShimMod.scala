package typingsJapgolly.workboxWindow

import typingsJapgolly.workboxWindow.typesWorkboxEventMod.WorkboxEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEventTargetShimMod {
  
  @JSImport("workbox-window/utils/EventTargetShim", "EventTargetShim")
  @js.native
  open class EventTargetShim () extends StObject {
    
    def addEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
    
    def dispatchEvent(evt: WorkboxEvent): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
  }
  
  type EventListenerShim = js.Function1[/* evt */ WorkboxEvent, Unit]
}
