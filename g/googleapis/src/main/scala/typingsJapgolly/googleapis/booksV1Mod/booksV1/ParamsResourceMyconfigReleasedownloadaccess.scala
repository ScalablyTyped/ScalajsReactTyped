package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMyconfigReleasedownloadaccess extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The device/version ID from which to release the restriction.
    */
  var cpksver: js.UndefOr[String] = js.native
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The volume(s) to release restrictions for.
    */
  var volumeIds: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceMyconfigReleasedownloadaccess {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    cpksver: String = null,
    fields: String = null,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    source: String = null,
    userIp: String = null,
    volumeIds: js.Array[String] = null
  ): ParamsResourceMyconfigReleasedownloadaccess = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (cpksver != null) __obj.updateDynamic("cpksver")(cpksver.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeIds != null) __obj.updateDynamic("volumeIds")(volumeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceMyconfigReleasedownloadaccess]
  }
}

