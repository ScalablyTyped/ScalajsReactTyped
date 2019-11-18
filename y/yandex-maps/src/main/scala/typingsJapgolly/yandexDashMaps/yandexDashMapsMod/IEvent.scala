package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  def allowMapEvent(): Unit
  def callMethod(name: String): Unit
  def get(name: String): js.Object
  def getSourceEvent(): IEvent | Null
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isMapEventAllowed(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Boolean
  def stopImmediatePropagation(): Boolean
  def stopPropagation(): Boolean
}

object IEvent {
  @scala.inline
  def apply(
    allowMapEvent: Callback,
    callMethod: String => Callback,
    get: String => CallbackTo[js.Object],
    getSourceEvent: CallbackTo[IEvent | Null],
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isMapEventAllowed: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: CallbackTo[Boolean],
    stopImmediatePropagation: CallbackTo[Boolean],
    stopPropagation: CallbackTo[Boolean]
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowMapEvent")(allowMapEvent.toJsFn)
    __obj.updateDynamic("callMethod")(js.Any.fromFunction1((t0: java.lang.String) => callMethod(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getSourceEvent")(getSourceEvent.toJsFn)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isMapEventAllowed")(isMapEventAllowed.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[IEvent]
  }
}

