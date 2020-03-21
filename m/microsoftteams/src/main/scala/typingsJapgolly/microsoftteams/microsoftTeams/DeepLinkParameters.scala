package typingsJapgolly.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLinkParameters extends js.Object {
  /**
    * The developer-defined unique ID for the sub-entity to which this deep link points in the current entity.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: String
  /**
    * The label for the sub-entity that should be displayed when the deep link is rendered in a client.
    */
  var subEntityLabel: String
  /**
    * The fallback URL to which to navigate the user if the client cannot render the page.
    * This URL should lead directly to the sub-entity.
    */
  var subEntityWebUrl: js.UndefOr[String] = js.undefined
}

object DeepLinkParameters {
  @scala.inline
  def apply(subEntityId: String, subEntityLabel: String, subEntityWebUrl: String = null): DeepLinkParameters = {
    val __obj = js.Dynamic.literal(subEntityId = subEntityId.asInstanceOf[js.Any], subEntityLabel = subEntityLabel.asInstanceOf[js.Any])
    if (subEntityWebUrl != null) __obj.updateDynamic("subEntityWebUrl")(subEntityWebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkParameters]
  }
}

