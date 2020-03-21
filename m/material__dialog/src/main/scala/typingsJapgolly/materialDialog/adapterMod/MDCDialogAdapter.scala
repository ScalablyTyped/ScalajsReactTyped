package typingsJapgolly.materialDialog.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDialogAdapter extends js.Object {
  def addBodyClass(className: String): Unit
  def addClass(className: String): Unit
  def deregisterDocumentKeydownHandler(handler: EventListener): Unit
  def deregisterInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterSurfaceInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterTransitionEndHandler(handler: EventListener): Unit
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  def isDialog(el: Element): Boolean
  def notifyAccept(): Unit
  def notifyCancel(): Unit
  def registerDocumentKeydownHandler(handler: EventListener): Unit
  def registerInteractionHandler(evt: String, handler: EventListener): Unit
  def registerSurfaceInteractionHandler(evt: String, handler: EventListener): Unit
  def registerTransitionEndHandler(handler: EventListener): Unit
  def removeBodyClass(className: String): Unit
  def removeClass(className: String): Unit
  def trapFocusOnSurface(): Unit
  def untrapFocusOnSurface(): Unit
}

object MDCDialogAdapter {
  @scala.inline
  def apply(
    addBodyClass: String => Callback,
    addClass: String => Callback,
    deregisterDocumentKeydownHandler: EventListener => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    deregisterSurfaceInteractionHandler: (String, EventListener) => Callback,
    deregisterTransitionEndHandler: EventListener => Callback,
    eventTargetHasClass: (EventTarget, String) => CallbackTo[Boolean],
    isDialog: Element => CallbackTo[Boolean],
    notifyAccept: Callback,
    notifyCancel: Callback,
    registerDocumentKeydownHandler: EventListener => Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    registerSurfaceInteractionHandler: (String, EventListener) => Callback,
    registerTransitionEndHandler: EventListener => Callback,
    removeBodyClass: String => Callback,
    removeClass: String => Callback,
    trapFocusOnSurface: Callback,
    untrapFocusOnSurface: Callback
  ): MDCDialogAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBodyClass")(js.Any.fromFunction1((t0: java.lang.String) => addBodyClass(t0).runNow()))
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterDocumentKeydownHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterDocumentKeydownHandler(t0).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterSurfaceInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterSurfaceInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterTransitionEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterTransitionEndHandler(t0).runNow()))
    __obj.updateDynamic("eventTargetHasClass")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.EventTarget, t1: java.lang.String) => eventTargetHasClass(t0, t1).runNow()))
    __obj.updateDynamic("isDialog")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => isDialog(t0).runNow()))
    __obj.updateDynamic("notifyAccept")(notifyAccept.toJsFn)
    __obj.updateDynamic("notifyCancel")(notifyCancel.toJsFn)
    __obj.updateDynamic("registerDocumentKeydownHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerDocumentKeydownHandler(t0).runNow()))
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerSurfaceInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerSurfaceInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerTransitionEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerTransitionEndHandler(t0).runNow()))
    __obj.updateDynamic("removeBodyClass")(js.Any.fromFunction1((t0: java.lang.String) => removeBodyClass(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("trapFocusOnSurface")(trapFocusOnSurface.toJsFn)
    __obj.updateDynamic("untrapFocusOnSurface")(untrapFocusOnSurface.toJsFn)
    __obj.asInstanceOf[MDCDialogAdapter]
  }
}

