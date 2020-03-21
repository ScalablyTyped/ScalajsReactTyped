package typingsJapgolly.wonderJs

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.ieventdataMod.ITouchEventData
import typingsJapgolly.wonderJs.pointEventHandlerMod.PointEventHandler
import typingsJapgolly.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", JSImport.Namespace)
@js.native
object touchEventHandlerMod extends js.Object {
  @js.native
  class TouchEventHandler () extends PointEventHandler {
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ TouchEvent, Unit]): js.Any = js.native
    /* protected */ def createEventObject(dom: HTMLElement, event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  
  /* static members */
  @js.native
  object TouchEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

