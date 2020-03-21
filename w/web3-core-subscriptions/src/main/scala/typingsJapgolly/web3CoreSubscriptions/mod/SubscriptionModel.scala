package typingsJapgolly.web3CoreSubscriptions.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionModel extends js.Object {
  var inputFormatter: js.Array[js.Function0[Unit]]
  var params: Double
  var subscriptionName: String
  def outputFormatter(): Unit
  def subscriptionHandler(): Unit
}

object SubscriptionModel {
  @scala.inline
  def apply(
    inputFormatter: js.Array[js.Function0[Unit]],
    outputFormatter: Callback,
    params: Double,
    subscriptionHandler: Callback,
    subscriptionName: String
  ): SubscriptionModel = {
    val __obj = js.Dynamic.literal(inputFormatter = inputFormatter.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.updateDynamic("outputFormatter")(outputFormatter.toJsFn)
    __obj.updateDynamic("subscriptionHandler")(subscriptionHandler.toJsFn)
    __obj.asInstanceOf[SubscriptionModel]
  }
}

