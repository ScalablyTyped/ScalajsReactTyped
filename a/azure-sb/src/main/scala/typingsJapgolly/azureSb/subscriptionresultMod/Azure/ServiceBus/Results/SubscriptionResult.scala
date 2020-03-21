package typingsJapgolly.azureSb.subscriptionresultMod.Azure.ServiceBus.Results

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(resource: SubscriptionProperties): String
}

object SubscriptionResult {
  @scala.inline
  def apply(
    parse: js.Object => CallbackTo[js.Object | js.Array[js.Object]],
    serialize: SubscriptionProperties => CallbackTo[String]
  ): SubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Object) => parse(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: typingsJapgolly.azureSb.subscriptionresultMod.Azure.ServiceBus.Results.SubscriptionProperties) => serialize(t0).runNow()))
    __obj.asInstanceOf[SubscriptionResult]
  }
}

