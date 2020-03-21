package typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.AnonDispose
import typingsJapgolly.officeUiFabricReact.utilitiesMod.EventGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelper extends js.Object {
  /**
    * Dispose of listeners bound to instance of helper.
    */
  def dispose(): Unit
  /**
    * Subscribe to events on a DOM node with drag and drop configuration.
    */
  def subscribe(root: HTMLElement, events: EventGroup, options: IDragDropOptions): AnonDispose
  /**
    * Unsubscribe to events registered on a DOM node with key.
    */
  def unsubscribe(root: HTMLElement, key: String): Unit
}

object IDragDropHelper {
  @scala.inline
  def apply(
    dispose: Callback,
    subscribe: (HTMLElement, EventGroup, IDragDropOptions) => CallbackTo[AnonDispose],
    unsubscribe: (HTMLElement, String) => Callback
  ): IDragDropHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: typingsJapgolly.officeUiFabricReact.utilitiesMod.EventGroup, t2: typingsJapgolly.officeUiFabricReact.dragdropInterfacesMod.IDragDropOptions) => subscribe(t0, t1, t2).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[IDragDropHelper]
  }
}

