package typingsJapgolly.wonderJs

import typingsJapgolly.std.HTMLElement
import typingsJapgolly.wonderJs.domEventHandlerMod.DomEventHandler
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.ieventdataMod.IKeyboardEventData
import typingsJapgolly.wonderJs.keyboardEventMod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", JSImport.Namespace)
@js.native
object keyboardEventHandlerMod extends js.Object {
  @js.native
  class KeyboardEventHandler () extends DomEventHandler {
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit]): js.Any = js.native
    def on(
      dom: HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ KeyboardEvent, Unit],
      priority: Double
    ): js.Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit], priority: Double): js.Any = js.native
    /* protected */ def triggerDomEvent(dom: org.scalajs.dom.raw.HTMLElement, event: IKeyboardEventData, eventName: EEventName): Unit = js.native
  }
  
  /* static members */
  @js.native
  object KeyboardEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

