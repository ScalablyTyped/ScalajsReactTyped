package typingsJapgolly.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGeteffectiveorgpolicy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetEffectiveOrgPolicyRequest] = js.native
  /**
    * The name of the resource to start computing the effective `Policy`.
    */
  var resource: js.UndefOr[String] = js.native
}

