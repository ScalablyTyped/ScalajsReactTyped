package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.anon.X
import typingsJapgolly.wonderJs.distEs2015EventInterfaceIeventdataMod.IMouseEventData
import typingsJapgolly.wonderJs.distEs2015EventObjectDomEventMod.DomEvent
import typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.distEs2015StructurePointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectMouseEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
  @js.native
  open class MouseEvent protected () extends DomEvent {
    def this(event: Any, eventName: EEventName) = this()
    
    var button: Double = js.native
    
    @JSName("event")
    var event_MouseEvent: IMouseEventData = js.native
    
    var lastX: Double = js.native
    
    var lastY: Double = js.native
    
    var location: Point = js.native
    
    var locationInView: Point = js.native
    
    val movementDelta: X = js.native
    
    val wheel: Double = js.native
  }
  /* static members */
  object MouseEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(event: IMouseEventData, eventName: EEventName): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  }
}
