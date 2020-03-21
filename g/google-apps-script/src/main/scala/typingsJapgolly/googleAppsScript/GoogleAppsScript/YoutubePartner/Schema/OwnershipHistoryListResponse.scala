package typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnershipHistoryListResponse extends js.Object {
  var items: js.UndefOr[js.Array[RightsOwnershipHistory]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object OwnershipHistoryListResponse {
  @scala.inline
  def apply(items: js.Array[RightsOwnershipHistory] = null, kind: String = null): OwnershipHistoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipHistoryListResponse]
  }
}

