package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsTabConfiguration extends js.Object {
  // Url used for rendering tab contents in Teams. Required.
  var contentUrl: js.UndefOr[String] = js.undefined
  // Identifier for the entity hosted by the tab provider.
  var entityId: js.UndefOr[String] = js.undefined
  // Url called by Teams client when a Tab is removed using the Teams Client.
  var removeUrl: js.UndefOr[String] = js.undefined
  // Url for showing tab contents outside of Teams.
  var websiteUrl: js.UndefOr[String] = js.undefined
}

object TeamsTabConfiguration {
  @scala.inline
  def apply(
    contentUrl: String = null,
    entityId: String = null,
    removeUrl: String = null,
    websiteUrl: String = null
  ): TeamsTabConfiguration = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsTabConfiguration]
  }
}

