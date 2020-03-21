package typingsJapgolly.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountsCustomBatchRequestEntryLinkRequest extends js.Object {
  /**
    * Action to perform for this link. The &quot;request&quot; action is only
    * available to select merchants.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Type of the link between the two accounts.
    */
  var linkType: js.UndefOr[String] = js.native
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String] = js.native
}

object SchemaAccountsCustomBatchRequestEntryLinkRequest {
  @scala.inline
  def apply(action: String = null, linkType: String = null, linkedAccountId: String = null): SchemaAccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (linkType != null) __obj.updateDynamic("linkType")(linkType.asInstanceOf[js.Any])
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntryLinkRequest]
  }
}

