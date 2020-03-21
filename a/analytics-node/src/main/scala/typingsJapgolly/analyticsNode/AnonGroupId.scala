package typingsJapgolly.analyticsNode

import typingsJapgolly.analyticsNode.mod.AnalyticsNode.Integrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupId extends js.Object {
  var anonymousId: js.UndefOr[String | Double] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var groupId: String | Double
  var integrations: js.UndefOr[Integrations] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
  var traits: js.UndefOr[js.Any] = js.undefined
  var userId: js.UndefOr[String | Double] = js.undefined
}

object AnonGroupId {
  @scala.inline
  def apply(
    groupId: String | Double,
    anonymousId: String | Double = null,
    context: js.Any = null,
    integrations: Integrations = null,
    timestamp: js.Date = null,
    traits: js.Any = null,
    userId: String | Double = null
  ): AnonGroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupId]
  }
}

