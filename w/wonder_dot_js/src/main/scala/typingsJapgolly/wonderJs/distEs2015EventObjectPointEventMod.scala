package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015EventInterfaceIeventdataMod.IPointEventData
import typingsJapgolly.wonderJs.distEs2015EventObjectDomEventMod.DomEvent
import typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent
import typingsJapgolly.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent
import typingsJapgolly.wonderJs.distEs2015StructurePointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectPointEventMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/object/PointEvent", "PointEvent")
  @js.native
  open class PointEvent protected () extends DomEvent {
    def this(event: Any, eventName: EEventName) = this()
    
    var button: Double | Null = js.native
    
    /* protected */ def cloneHelper(eventObj: PointEvent): PointEvent = js.native
    
    var eventObj: MouseEvent | TouchEvent = js.native
    
    @JSName("event")
    var event_PointEvent: IPointEventData = js.native
    
    def getDataFromEventObj(eventObj: MouseEvent): Unit = js.native
    def getDataFromEventObj(eventObj: TouchEvent): Unit = js.native
    
    var lastX: Double = js.native
    
    var lastY: Double = js.native
    
    var location: Point = js.native
    
    var locationInView: Point = js.native
    
    val movementDelta: Point = js.native
    
    val wheel: Double | Null = js.native
  }
}
