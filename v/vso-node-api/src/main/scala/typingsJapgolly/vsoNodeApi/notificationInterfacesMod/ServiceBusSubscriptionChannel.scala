package typingsJapgolly.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceBusSubscriptionChannel extends js.Object {
  var `type`: String
}

object ServiceBusSubscriptionChannel {
  @scala.inline
  def apply(`type`: String): ServiceBusSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBusSubscriptionChannel]
  }
}

