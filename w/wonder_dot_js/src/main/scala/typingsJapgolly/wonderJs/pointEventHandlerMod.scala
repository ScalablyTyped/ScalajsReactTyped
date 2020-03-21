package typingsJapgolly.wonderJs

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wonderJs.domEventHandlerMod.DomEventHandler
import typingsJapgolly.wonderJs.domEventMod.DomEvent
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.ieventdataMod.IEventData
import typingsJapgolly.wonderJs.mouseEventMod.MouseEvent
import typingsJapgolly.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", JSImport.Namespace)
@js.native
object pointEventHandlerMod extends js.Object {
  @js.native
  abstract class PointEventHandler () extends DomEventHandler {
    /* protected */ def createEventObject(dom: HTMLElement, event: IEventData, eventName: EEventName): DomEvent = js.native
    /* protected */ def handleMove(handler: js.Function1[/* event */ MouseEvent | TouchEvent, Unit]): js.Function2[
        /* event */ MouseEvent | TouchEvent, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ js.Any, 
        Unit
      ] = js.native
    def on(
      dom: typingsJapgolly.std.HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ DomEvent, Unit],
      priority: Double
    ): js.Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ DomEvent, Unit], priority: Double): js.Any = js.native
  }
  
}

