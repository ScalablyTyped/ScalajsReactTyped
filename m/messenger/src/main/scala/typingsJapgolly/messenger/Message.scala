package typingsJapgolly.messenger

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit
}

object Message {
  @scala.inline
  def apply(cancel: Callback, hide: Callback, show: Callback, update: MessageOptions => Callback): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.messenger.MessageOptions) => update(t0).runNow()))
    __obj.asInstanceOf[Message]
  }
}

