package typingsJapgolly.googleMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHandle[T] extends js.Object {
  /**
    * Cancels the request.
    * The ResponseCallback will not be invoked, and promises will not be settled.
    * Use the RequestHandle#finally handler will still be called.
    */
  def cancel(): Unit
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[Unit]): RequestHandle[T]
}

object RequestHandle {
  @scala.inline
  def apply[T](cancel: Callback, `finally`: js.Function0[Unit] => CallbackTo[RequestHandle[T]]): RequestHandle[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("finally")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => `finally`(t0).runNow()))
    __obj.asInstanceOf[RequestHandle[T]]
  }
}

