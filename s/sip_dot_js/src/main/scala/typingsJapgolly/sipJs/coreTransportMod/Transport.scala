package typingsJapgolly.sipJs.coreTransportMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  /**
    * The transport protocol.
    *
    * @remarks
    * Formatted as defined for the Via header sent-protocol transport.
    * https://tools.ietf.org/html/rfc3261#section-20.42
    */
  val protocol: String
  /**
    * Send a message.
    *
    * @remarks
    * Resolves once message is sent. Otherwise rejects with an Error.
    *
    * @param message - Message to send.
    */
  def send(message: String): js.Promise[Unit]
}

object Transport {
  @scala.inline
  def apply(protocol: String, send: String => CallbackTo[js.Promise[Unit]]): Transport = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: java.lang.String) => send(t0).runNow()))
    __obj.asInstanceOf[Transport]
  }
}

