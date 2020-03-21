package typingsJapgolly.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepRevisionForever extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to
    * the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    */
  var ignoreDefaultVisibility: js.UndefOr[Boolean] = js.undefined
  /** Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Drive. */
  var keepRevisionForever: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** A language hint for OCR processing during image import (ISO 639-1 code). */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Resource Parameter for folder creation */
  var resource: js.UndefOr[js.Any] = js.undefined
  /** Whether the requesting application supports Team Drives. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  /** Whether to use the uploaded content as indexable text. */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonKeepRevisionForever {
  @scala.inline
  def apply(
    alt: String = null,
    fields: String = null,
    ignoreDefaultVisibility: js.UndefOr[Boolean] = js.undefined,
    keepRevisionForever: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    ocrLanguage: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    resource: js.Any = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): AnonKeepRevisionForever = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDefaultVisibility)) __obj.updateDynamic("ignoreDefaultVisibility")(ignoreDefaultVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRevisionForever)) __obj.updateDynamic("keepRevisionForever")(keepRevisionForever.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepRevisionForever]
  }
}

