package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemStatus extends js.Object {
  var privacyStatus: js.UndefOr[String] = js.undefined
}

object PlaylistItemStatus {
  @scala.inline
  def apply(privacyStatus: String = null): PlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItemStatus]
  }
}

