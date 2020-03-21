package typingsJapgolly.samchon.iprotocolMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtocol extends js.Object {
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  def replyData(invoke: Invoke): Unit
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  def sendData(invoke: Invoke): Unit
}

object IProtocol {
  @scala.inline
  def apply(replyData: Invoke => Callback, sendData: Invoke => Callback): IProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replyData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => replyData(t0).runNow()))
    __obj.updateDynamic("sendData")(js.Any.fromFunction1((t0: typingsJapgolly.samchon.invokeMod.Invoke) => sendData(t0).runNow()))
    __obj.asInstanceOf[IProtocol]
  }
}

