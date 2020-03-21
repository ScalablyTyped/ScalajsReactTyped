package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFWorker extends js.Object {
  val messageHandler: js.Any | Null
  val port: js.Any | Null
  val promise: js.Promise[_]
  def destroy(): Unit
}

object PDFWorker {
  @scala.inline
  def apply(destroy: Callback, promise: js.Promise[_], messageHandler: js.Any = null, port: js.Any = null): PDFWorker = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    if (messageHandler != null) __obj.updateDynamic("messageHandler")(messageHandler.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWorker]
  }
}

