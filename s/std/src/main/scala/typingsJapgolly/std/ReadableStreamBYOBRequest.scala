package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: scala.scalajs.js.typedarray.ArrayBufferView
  def respond(bytesWritten: Double): Unit
  def respondWithNewView(view: scala.scalajs.js.typedarray.ArrayBufferView): Unit
}

object ReadableStreamBYOBRequest {
  @scala.inline
  def apply(
    respond: Double => Callback,
    respondWithNewView: scala.scalajs.js.typedarray.ArrayBufferView => Callback,
    view: scala.scalajs.js.typedarray.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("respond")(js.Any.fromFunction1((t0: scala.Double) => respond(t0).runNow()))
    __obj.updateDynamic("respondWithNewView")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.ArrayBufferView) => respondWithNewView(t0).runNow()))
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
}

