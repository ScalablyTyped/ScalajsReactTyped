package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.domEventMod.DomEvent
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.ieventdataMod.ITouchData
import typingsJapgolly.wonderJs.ieventdataMod.ITouchEventData
import typingsJapgolly.wonderJs.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchEvent", JSImport.Namespace)
@js.native
object touchEventMod extends js.Object {
  @js.native
  class TouchEvent () extends DomEvent {
    @JSName("event")
    var event_TouchEvent: ITouchEventData = js.native
    var lastX: Double = js.native
    var lastY: Double = js.native
    var location: Point = js.native
    var locationInView: Point = js.native
    val movementDelta: AnonX = js.native
    val touchData: ITouchData = js.native
  }
  
  /* static members */
  @js.native
  object TouchEvent extends js.Object {
    def create(event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  
}

