package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.mouseEventMod.MouseEvent
import typingsJapgolly.wonderJs.pointEventMod.PointEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", JSImport.Namespace)
@js.native
object mousePointEventMod extends js.Object {
  @js.native
  class MousePointEvent () extends PointEvent {
    @JSName("button")
    var button_MousePointEvent: Double = js.native
    @JSName("eventObj")
    var eventObj_MousePointEvent: MouseEvent = js.native
    @JSName("movementDelta")
    val movementDelta_MousePointEvent: AnonX = js.native
    @JSName("wheel")
    val wheel_MousePointEvent: Double = js.native
  }
  
  /* static members */
  @js.native
  object MousePointEvent extends js.Object {
    def create(eventName: EEventName): MousePointEvent = js.native
  }
  
}

