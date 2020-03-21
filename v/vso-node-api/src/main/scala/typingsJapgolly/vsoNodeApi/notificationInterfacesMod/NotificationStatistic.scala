package typingsJapgolly.vsoNodeApi.notificationInterfacesMod

import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationStatistic extends js.Object {
  var date: js.Date
  var hitCount: Double
  var path: String
  var `type`: NotificationStatisticType
  var user: IdentityRef
}

object NotificationStatistic {
  @scala.inline
  def apply(
    date: js.Date,
    hitCount: Double,
    path: String,
    `type`: NotificationStatisticType,
    user: IdentityRef
  ): NotificationStatistic = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationStatistic]
  }
}

