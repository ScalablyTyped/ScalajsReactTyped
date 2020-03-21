package typingsJapgolly.wonderJs.domEventRegisterMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wonderJs.domEventListenerMapMod.DomEventListenerMap
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import typingsJapgolly.wonderJs.eventRegisterMod.EventRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
@js.native
class DomEventRegister () extends EventRegister {
  @JSName("listenerMap")
  var listenerMap_DomEventRegister: DomEventListenerMap = js.native
  def getDomHandler(dom: HTMLElement, eventName: EEventName): js.Function = js.native
  def isBinded(dom: HTMLElement, eventName: EEventName): Boolean = js.native
  def register(
    dom: HTMLElement,
    eventName: EEventName,
    eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: Double
  ): Unit = js.native
  def remove(dom: typingsJapgolly.std.HTMLElement, eventName: EEventName): js.Any = js.native
  def remove(dom: typingsJapgolly.std.HTMLElement, eventName: EEventName, handler: js.Function): js.Any = js.native
  def remove(eventName: EEventName): js.Any = js.native
  def remove(eventName: EEventName, handler: js.Function): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
@js.native
object DomEventRegister extends js.Object {
  def getInstance(): js.Any = js.native
}

