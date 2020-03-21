package typingsJapgolly.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsSourcesFindingsGroup extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the source to groupBy. Its format is
    * "organizations/[organization_id]/sources/[source_id]". To groupBy across
    * all sources provide a source_id of `-`. For example:
    * organizations/123/sources/-
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGroupFindingsRequest] = js.native
}

