package typingsJapgolly.sipJs.transactionUserMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.coreExceptionsMod.TransportError
import typingsJapgolly.sipJs.logMod.LoggerFactory
import typingsJapgolly.sipJs.messagesMod.IncomingResponseMessage
import typingsJapgolly.sipJs.transactionStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTransactionUser extends TransactionUser {
  /**
    * Callback for request timeout error.
    *
    * When a timeout error is received from the transaction layer, it MUST be
    * treated as if a 408 (Request Timeout) status code has been received.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * TU MUST be informed of a timeout.
    * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
    */
  var onRequestTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback for delegation of valid response handling.
    *
    * Valid responses are passed up to the TU from the client transaction.
    * https://tools.ietf.org/html/rfc3261#section-17.1
    */
  var receiveResponse: js.UndefOr[js.Function1[/* response */ IncomingResponseMessage, Unit]] = js.undefined
}

object ClientTransactionUser {
  @scala.inline
  def apply(
    loggerFactory: LoggerFactory,
    onRequestTimeout: js.UndefOr[Callback] = js.undefined,
    onStateChange: /* newState */ TransactionState => Callback = null,
    onTransportError: /* error */ TransportError => Callback = null,
    receiveResponse: /* response */ IncomingResponseMessage => Callback = null
  ): ClientTransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    onRequestTimeout.foreach(p => __obj.updateDynamic("onRequestTimeout")(p.toJsFn))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* newState */ typingsJapgolly.sipJs.transactionStateMod.TransactionState) => onStateChange(t0).runNow()))
    if (onTransportError != null) __obj.updateDynamic("onTransportError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.sipJs.coreExceptionsMod.TransportError) => onTransportError(t0).runNow()))
    if (receiveResponse != null) __obj.updateDynamic("receiveResponse")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.sipJs.messagesMod.IncomingResponseMessage) => receiveResponse(t0).runNow()))
    __obj.asInstanceOf[ClientTransactionUser]
  }
}

