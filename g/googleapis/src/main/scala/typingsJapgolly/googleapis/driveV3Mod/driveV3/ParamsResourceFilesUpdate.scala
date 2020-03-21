package typingsJapgolly.googleapis.driveV3Mod.driveV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import typingsJapgolly.googleapis.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesUpdate extends StandardParameters {
  /**
    * A comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is
    * only applicable to files with binary content in Drive.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[AnonBody] = js.native
  /**
    * A language hint for OCR processing during image import (ISO 639-1 code).
    */
  var ocrLanguage: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the uploaded content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}

object ParamsResourceFilesUpdate {
  @scala.inline
  def apply(
    addParents: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    fileId: String = null,
    keepRevisionForever: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    media: AnonBody = null,
    oauth_token: String = null,
    ocrLanguage: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    removeParents: String = null,
    requestBody: SchemaFile = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsResourceFilesUpdate = {
    val __obj = js.Dynamic.literal()
    if (addParents != null) __obj.updateDynamic("addParents")(addParents.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRevisionForever)) __obj.updateDynamic("keepRevisionForever")(keepRevisionForever.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceFilesUpdate]
  }
}

