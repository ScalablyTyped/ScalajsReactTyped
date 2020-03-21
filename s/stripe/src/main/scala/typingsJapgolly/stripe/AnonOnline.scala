package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.accepted
import typingsJapgolly.stripe.stripeStrings.offline
import typingsJapgolly.stripe.stripeStrings.online
import typingsJapgolly.stripe.stripeStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnline extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var offline: js.UndefOr[AnonContactemail] = js.undefined
  var online: js.UndefOr[AnonUseragent] = js.undefined
  var status: accepted | refused
  var `type`: online | offline
  var user_agent: js.UndefOr[String] = js.undefined
}

object AnonOnline {
  @scala.inline
  def apply(
    status: accepted | refused,
    `type`: online | offline,
    date: Int | Double = null,
    ip: String = null,
    offline: AnonContactemail = null,
    online: AnonUseragent = null,
    user_agent: String = null
  ): AnonOnline = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (offline != null) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (online != null) __obj.updateDynamic("online")(online.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnline]
  }
}

