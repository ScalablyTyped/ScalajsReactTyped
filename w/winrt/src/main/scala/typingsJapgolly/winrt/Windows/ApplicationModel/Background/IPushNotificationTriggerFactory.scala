package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationTriggerFactory extends js.Object {
  def create(applicationId: String): PushNotificationTrigger
}

object IPushNotificationTriggerFactory {
  @scala.inline
  def apply(create: String => CallbackTo[PushNotificationTrigger]): IPushNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.asInstanceOf[IPushNotificationTriggerFactory]
  }
}

