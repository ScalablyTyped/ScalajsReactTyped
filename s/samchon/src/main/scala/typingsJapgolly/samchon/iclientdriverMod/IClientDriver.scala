package typingsJapgolly.samchon.iclientdriverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.samchon.icommunicatorMod.ICommunicator
import typingsJapgolly.samchon.invokeMod.Invoke
import typingsJapgolly.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientDriver extends ICommunicator {
  /**
    * Listen message from the newly connected client.
    *
    * Starts listening message from the newly connected client. Replied message from the connected client will be
    * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
    * method.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def listen(listener: IProtocol): Unit
}

object IClientDriver {
  @scala.inline
  def apply(
    close: Callback,
    isConnected: CallbackTo[Boolean],
    listen: IProtocol => Callback,
    onClose: js.Function,
    replyData: Invoke => Callback,
    sendData: Invoke => Callback
  ): IClientDriver = {
    val __obj = js.Dynamic.literal(onClose = onClose.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("isConnected")(isConnected.toJsFn)
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.iprotocolMod.IProtocol) => listen(t0).runNow()))
    __obj.updateDynamic("replyData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => replyData(t0).runNow()))
    __obj.updateDynamic("sendData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => sendData(t0).runNow()))
    __obj.asInstanceOf[IClientDriver]
  }
}

