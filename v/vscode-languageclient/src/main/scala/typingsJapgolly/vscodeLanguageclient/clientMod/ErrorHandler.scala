package typingsJapgolly.vscodeLanguageclient.clientMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscodeJsonrpc.messagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandler extends js.Object {
  /**
    * The connection to the server got closed.
    */
  def closed(): CloseAction
  /**
    * An error has occurred while writing or reading from the connection.
    *
    * @param error - the error received
    * @param message - the message to be delivered to the server if know.
    * @param count - a count indicating how often an error is received. Will
    *  be reset if a message got successfully send or received.
    */
  def error(error: js.Error, message: Message, count: Double): ErrorAction
}

object ErrorHandler {
  @scala.inline
  def apply(closed: CallbackTo[CloseAction], error: (js.Error, Message, Double) => CallbackTo[ErrorAction]): ErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(closed.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction3((t0: js.Error, t1: typingsJapgolly.vscodeJsonrpc.messagesMod.Message, t2: scala.Double) => error(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ErrorHandler]
  }
}

