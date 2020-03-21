package typingsJapgolly.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicProfile extends js.Object {
  /** The URL to the main display image of the public profile. Being deprecated. */
  var displayImageUrl: js.UndefOr[String] = js.undefined
  /** The display name of the public profile. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID which can be used to retrieve more details about the public profile. */
  var id: js.UndefOr[String] = js.undefined
  /** The URL to the main profile image of the public profile. */
  var profileImage: js.UndefOr[String] = js.undefined
  /** The URL of the public profile. */
  var url: js.UndefOr[String] = js.undefined
}

object PublicProfile {
  @scala.inline
  def apply(
    displayImageUrl: String = null,
    displayName: String = null,
    id: String = null,
    profileImage: String = null,
    url: String = null
  ): PublicProfile = {
    val __obj = js.Dynamic.literal()
    if (displayImageUrl != null) __obj.updateDynamic("displayImageUrl")(displayImageUrl.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (profileImage != null) __obj.updateDynamic("profileImage")(profileImage.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicProfile]
  }
}

