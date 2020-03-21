package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationTriggerFactory extends js.Object {
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger
}

object INetworkOperatorNotificationTriggerFactory {
  @scala.inline
  def apply(create: String => CallbackTo[NetworkOperatorNotificationTrigger]): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
}

