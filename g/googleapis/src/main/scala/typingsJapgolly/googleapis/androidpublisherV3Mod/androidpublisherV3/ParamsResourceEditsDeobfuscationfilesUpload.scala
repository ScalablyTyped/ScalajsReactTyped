package typingsJapgolly.googleapis.androidpublisherV3Mod.androidpublisherV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import typingsJapgolly.googleapis.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEditsDeobfuscationfilesUpload extends StandardParameters {
  /**
    * The version code of the APK whose deobfuscation file is being uploaded.
    */
  var apkVersionCode: js.UndefOr[Double] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    *
    */
  var deobfuscationFileType: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[AnonBody] = js.native
  /**
    * Unique identifier of the Android app for which the deobfuscatiuon files
    * are being uploaded; for example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
}

object ParamsResourceEditsDeobfuscationfilesUpload {
  @scala.inline
  def apply(
    alt: String = null,
    apkVersionCode: Int | Double = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    deobfuscationFileType: String = null,
    editId: String = null,
    fields: String = null,
    key: String = null,
    media: AnonBody = null,
    oauth_token: String = null,
    packageName: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsResourceEditsDeobfuscationfilesUpload = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (apkVersionCode != null) __obj.updateDynamic("apkVersionCode")(apkVersionCode.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (deobfuscationFileType != null) __obj.updateDynamic("deobfuscationFileType")(deobfuscationFileType.asInstanceOf[js.Any])
    if (editId != null) __obj.updateDynamic("editId")(editId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceEditsDeobfuscationfilesUpload]
  }
}

