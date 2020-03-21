package typingsJapgolly.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The session to create a session entity type for. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project
    * ID>/agent/environments/<Environment ID>/users/<User ID>/
    * sessions/<Session ID>`. If `Environment ID` is not specified, we assume
    * default 'draft' environment. If `User ID` is not specified, we assume
    * default '-' user.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
}

