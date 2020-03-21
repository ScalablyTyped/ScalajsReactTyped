package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestingGateway extends js.Object {
  def settle(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementConfirm(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementDecline(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementOperationWithEnvironmentCheck(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
  def settlementPending(transactionId: String): js.Promise[ValidatedResponse[Transaction]]
}

object TestingGateway {
  @scala.inline
  def apply(
    settle: String => CallbackTo[js.Promise[ValidatedResponse[Transaction]]],
    settlementConfirm: String => CallbackTo[js.Promise[ValidatedResponse[Transaction]]],
    settlementDecline: String => CallbackTo[js.Promise[ValidatedResponse[Transaction]]],
    settlementOperationWithEnvironmentCheck: String => CallbackTo[js.Promise[ValidatedResponse[Transaction]]],
    settlementPending: String => CallbackTo[js.Promise[ValidatedResponse[Transaction]]]
  ): TestingGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("settle")(js.Any.fromFunction1((t0: java.lang.String) => settle(t0).runNow()))
    __obj.updateDynamic("settlementConfirm")(js.Any.fromFunction1((t0: java.lang.String) => settlementConfirm(t0).runNow()))
    __obj.updateDynamic("settlementDecline")(js.Any.fromFunction1((t0: java.lang.String) => settlementDecline(t0).runNow()))
    __obj.updateDynamic("settlementOperationWithEnvironmentCheck")(js.Any.fromFunction1((t0: java.lang.String) => settlementOperationWithEnvironmentCheck(t0).runNow()))
    __obj.updateDynamic("settlementPending")(js.Any.fromFunction1((t0: java.lang.String) => settlementPending(t0).runNow()))
    __obj.asInstanceOf[TestingGateway]
  }
}

