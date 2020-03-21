package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistStatus extends js.Object {
  /** The playlist's privacy status. */
  var privacyStatus: js.UndefOr[String] = js.undefined
}

object PlaylistStatus {
  @scala.inline
  def apply(privacyStatus: String = null): PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistStatus]
  }
}

