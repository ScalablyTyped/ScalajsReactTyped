package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.AnonGroupByCustomField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettlementBatchSummaryGateway extends js.Object {
  def generate(request: AnonGroupByCustomField): js.Promise[SettlementBatchSummary]
}

object SettlementBatchSummaryGateway {
  @scala.inline
  def apply(generate: AnonGroupByCustomField => CallbackTo[js.Promise[SettlementBatchSummary]]): SettlementBatchSummaryGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.AnonGroupByCustomField) => generate(t0).runNow()))
    __obj.asInstanceOf[SettlementBatchSummaryGateway]
  }
}

