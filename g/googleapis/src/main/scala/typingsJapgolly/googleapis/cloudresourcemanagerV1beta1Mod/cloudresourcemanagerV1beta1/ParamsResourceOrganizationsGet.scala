package typingsJapgolly.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the Organization to fetch. This is the
    * organization's relative path in the API, formatted as
    * "organizations/[organizationId]". For example, "organizations/1234".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The id of the Organization resource to fetch. This field is deprecated
    * and will be removed in v1. Use name instead.
    */
  var organizationId: js.UndefOr[String] = js.native
}

