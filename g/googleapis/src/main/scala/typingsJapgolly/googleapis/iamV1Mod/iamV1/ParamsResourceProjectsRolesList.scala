package typingsJapgolly.googleapis.iamV1Mod.iamV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRolesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional limit on the number of roles to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier ListRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The resource name of the parent resource in one of the following formats:
    * `` (empty string) -- this refers to curated roles.
    * `organizations/{ORGANIZATION_ID}` `projects/{PROJECT_ID}`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Include Roles that have been deleted.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Optional view for the returned Role objects. When `FULL` is specified,
    * the `includedPermissions` field is returned, which includes a list of all
    * permissions in the role. The default value is `BASIC`, which does not
    * return the `includedPermissions` field.
    */
  var view: js.UndefOr[String] = js.native
}

