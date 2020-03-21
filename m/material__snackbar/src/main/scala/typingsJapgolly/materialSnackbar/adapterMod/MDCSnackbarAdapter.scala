package typingsJapgolly.materialSnackbar.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSnackbarAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterActionClickHandler(handler: EventListener): Unit
  def deregisterCapturedBlurHandler(handler: EventListener): Unit
  def deregisterCapturedInteractionHandler(evtType: String, handler: EventListener): Unit
  def deregisterTransitionEndHandler(handler: EventListener): Unit
  def deregisterVisibilityChangeHandler(handler: EventListener): Unit
  def notifyHide(): Unit
  def notifyShow(): Unit
  def registerActionClickHandler(handler: EventListener): Unit
  def registerCapturedBlurHandler(handler: EventListener): Unit
  def registerCapturedInteractionHandler(evtType: String, handler: EventListener): Unit
  def registerTransitionEndHandler(handler: EventListener): Unit
  def registerVisibilityChangeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setActionAriaHidden(): Unit
  def setActionText(actionText: String): Unit
  def setAriaHidden(): Unit
  def setFocus(): Unit
  def setMessageText(message: String): Unit
  def unsetActionAriaHidden(): Unit
  def unsetAriaHidden(): Unit
  def visibilityIsHidden(): Boolean
}

object MDCSnackbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterActionClickHandler: EventListener => Callback,
    deregisterCapturedBlurHandler: EventListener => Callback,
    deregisterCapturedInteractionHandler: (String, EventListener) => Callback,
    deregisterTransitionEndHandler: EventListener => Callback,
    deregisterVisibilityChangeHandler: EventListener => Callback,
    notifyHide: Callback,
    notifyShow: Callback,
    registerActionClickHandler: EventListener => Callback,
    registerCapturedBlurHandler: EventListener => Callback,
    registerCapturedInteractionHandler: (String, EventListener) => Callback,
    registerTransitionEndHandler: EventListener => Callback,
    registerVisibilityChangeHandler: EventListener => Callback,
    removeClass: String => Callback,
    setActionAriaHidden: Callback,
    setActionText: String => Callback,
    setAriaHidden: Callback,
    setFocus: Callback,
    setMessageText: String => Callback,
    unsetActionAriaHidden: Callback,
    unsetAriaHidden: Callback,
    visibilityIsHidden: CallbackTo[Boolean]
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterActionClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterActionClickHandler(t0).runNow()))
    __obj.updateDynamic("deregisterCapturedBlurHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterCapturedBlurHandler(t0).runNow()))
    __obj.updateDynamic("deregisterCapturedInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterCapturedInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterTransitionEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterTransitionEndHandler(t0).runNow()))
    __obj.updateDynamic("deregisterVisibilityChangeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterVisibilityChangeHandler(t0).runNow()))
    __obj.updateDynamic("notifyHide")(notifyHide.toJsFn)
    __obj.updateDynamic("notifyShow")(notifyShow.toJsFn)
    __obj.updateDynamic("registerActionClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerActionClickHandler(t0).runNow()))
    __obj.updateDynamic("registerCapturedBlurHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerCapturedBlurHandler(t0).runNow()))
    __obj.updateDynamic("registerCapturedInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerCapturedInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerTransitionEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerTransitionEndHandler(t0).runNow()))
    __obj.updateDynamic("registerVisibilityChangeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerVisibilityChangeHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setActionAriaHidden")(setActionAriaHidden.toJsFn)
    __obj.updateDynamic("setActionText")(js.Any.fromFunction1((t0: java.lang.String) => setActionText(t0).runNow()))
    __obj.updateDynamic("setAriaHidden")(setAriaHidden.toJsFn)
    __obj.updateDynamic("setFocus")(setFocus.toJsFn)
    __obj.updateDynamic("setMessageText")(js.Any.fromFunction1((t0: java.lang.String) => setMessageText(t0).runNow()))
    __obj.updateDynamic("unsetActionAriaHidden")(unsetActionAriaHidden.toJsFn)
    __obj.updateDynamic("unsetAriaHidden")(unsetAriaHidden.toJsFn)
    __obj.updateDynamic("visibilityIsHidden")(visibilityIsHidden.toJsFn)
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
}

