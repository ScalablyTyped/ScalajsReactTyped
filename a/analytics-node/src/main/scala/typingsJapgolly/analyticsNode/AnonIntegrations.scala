package typingsJapgolly.analyticsNode

import typingsJapgolly.analyticsNode.mod.AnalyticsNode.Integrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntegrations extends js.Object {
  var anonymousId: js.UndefOr[String | Double] = js.undefined
  var integrations: js.UndefOr[Integrations] = js.undefined
  var previousId: String | Double
  var userId: js.UndefOr[String | Double] = js.undefined
}

object AnonIntegrations {
  @scala.inline
  def apply(
    previousId: String | Double,
    anonymousId: String | Double = null,
    integrations: Integrations = null,
    userId: String | Double = null
  ): AnonIntegrations = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntegrations]
  }
}

