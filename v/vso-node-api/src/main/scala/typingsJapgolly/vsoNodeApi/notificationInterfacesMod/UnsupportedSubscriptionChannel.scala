package typingsJapgolly.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedSubscriptionChannel extends js.Object {
  var `type`: String
}

object UnsupportedSubscriptionChannel {
  @scala.inline
  def apply(`type`: String): UnsupportedSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedSubscriptionChannel]
  }
}

