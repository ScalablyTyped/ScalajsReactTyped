package typingsJapgolly.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTransferconfigsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional OAuth2 authorization code to use with this transfer
    * configuration. This is required if new credentials are needed, as
    * indicated by `CheckValidCreds`. In order to obtain authorization_code,
    * please make a request to
    * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>
    * * client_id should be OAuth client_id of BigQuery DTS API for the given
    * data source returned by ListDataSources method. * data_source_scopes are
    * the scopes returned by ListDataSources method. * redirect_uri is an
    * optional parameter. If not specified, then   authorization code is posted
    * to the opener of authorization flow window.   Otherwise it will be sent
    * to the redirect uri. A special value of   urn:ietf:wg:oauth:2.0:oob means
    * that authorization code should be   returned in the title bar of the
    * browser, with the page text prompting   the user to copy the code and
    * paste it in the application.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  /**
    * The BigQuery project id where the transfer configuration should be
    * created. Must be in the format
    * projects/{project_id}/locations/{location_id} If specified location and
    * location of the destination bigquery dataset do not match - the request
    * will fail.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTransferConfig] = js.native
  /**
    * Optional version info. If users want to find a very recent access token,
    * that is, immediately after approving access, users have to set the
    * version_info claim in the token request. To obtain the version_info,
    * users must use the “none+gsession” response type. which be return a
    * version_info back in the authorization response which be be put in a JWT
    * claim in the token request.
    */
  var versionInfo: js.UndefOr[String] = js.native
}

