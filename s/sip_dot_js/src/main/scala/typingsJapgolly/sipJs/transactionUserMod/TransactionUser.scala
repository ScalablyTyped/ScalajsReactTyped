package typingsJapgolly.sipJs.transactionUserMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.coreExceptionsMod.TransportError
import typingsJapgolly.sipJs.logMod.LoggerFactory
import typingsJapgolly.sipJs.transactionStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionUser extends js.Object {
  /**
    * Logger factory.
    */
  var loggerFactory: LoggerFactory
  /**
    * Callback for notification of transaction state changes.
    *
    * Not called when transaction is constructed, so there is
    * no notification of entering the initial transaction state.
    * Otherwise, called once for each transaction state change.
    * State changes adhere to the following RFCs.
    * https://tools.ietf.org/html/rfc3261#section-17
    * https://tools.ietf.org/html/rfc6026
    */
  var onStateChange: js.UndefOr[js.Function1[/* newState */ TransactionState, Unit]] = js.undefined
  /**
    * Callback for notification of a transport error.
    *
    * If a fatal transport error is reported by the transport layer
    * (generally, due to fatal ICMP errors in UDP or connection failures in
    * TCP), the condition MUST be treated as a 503 (Service Unavailable)
    * status code.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * https://tools.ietf.org/html/rfc3261#section-17.1.4
    * https://tools.ietf.org/html/rfc3261#section-17.2.4
    * https://tools.ietf.org/html/rfc6026
    */
  var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.undefined
}

object TransactionUser {
  @scala.inline
  def apply(
    loggerFactory: LoggerFactory,
    onStateChange: /* newState */ TransactionState => Callback = null,
    onTransportError: /* error */ TransportError => Callback = null
  ): TransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* newState */ typingsJapgolly.sipJs.transactionStateMod.TransactionState) => onStateChange(t0).runNow()))
    if (onTransportError != null) __obj.updateDynamic("onTransportError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.sipJs.coreExceptionsMod.TransportError) => onTransportError(t0).runNow()))
    __obj.asInstanceOf[TransactionUser]
  }
}

