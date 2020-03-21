package typingsJapgolly.notifyjs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notify extends js.Object {
  /**
    * Close the notification.
    */
  def close(): Unit
  /**
    * Remove all event listener.
    */
  def destroy(): Unit
  def handleEvent(e: Event_): Unit
  def onClickNotification(): Unit
  def onCloseNotification(): Unit
  def onErrorNotification(): Unit
  def onShowNotification(e: Event_): Unit
  /**
    * Show the notification.
    */
  def show(): Unit
}

object Notify {
  @scala.inline
  def apply(
    close: Callback,
    destroy: Callback,
    handleEvent: Event_ => Callback,
    onClickNotification: Callback,
    onCloseNotification: Callback,
    onErrorNotification: Callback,
    onShowNotification: Event_ => Callback,
    show: Callback
  ): Notify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => handleEvent(t0).runNow()))
    __obj.updateDynamic("onClickNotification")(onClickNotification.toJsFn)
    __obj.updateDynamic("onCloseNotification")(onCloseNotification.toJsFn)
    __obj.updateDynamic("onErrorNotification")(onErrorNotification.toJsFn)
    __obj.updateDynamic("onShowNotification")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onShowNotification(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Notify]
  }
}

