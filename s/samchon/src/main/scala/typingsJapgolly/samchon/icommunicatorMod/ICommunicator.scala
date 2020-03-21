package typingsJapgolly.samchon.icommunicatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.samchon.invokeMod.Invoke
import typingsJapgolly.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommunicator extends IProtocol {
  /**
    * Callback function for connection closed.
    */
  var onClose: js.Function
  /**
    * Close connection.
    */
  def close(): Unit
  /**
    * Test connection.
    *
    * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
    * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
    * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
    *
    * @return true if connected, otherwise false.
    */
  def isConnected(): Boolean
}

object ICommunicator {
  @scala.inline
  def apply(
    close: Callback,
    isConnected: CallbackTo[Boolean],
    onClose: js.Function,
    replyData: Invoke => Callback,
    sendData: Invoke => Callback
  ): ICommunicator = {
    val __obj = js.Dynamic.literal(onClose = onClose.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("isConnected")(isConnected.toJsFn)
    __obj.updateDynamic("replyData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => replyData(t0).runNow()))
    __obj.updateDynamic("sendData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => sendData(t0).runNow()))
    __obj.asInstanceOf[ICommunicator]
  }
}

