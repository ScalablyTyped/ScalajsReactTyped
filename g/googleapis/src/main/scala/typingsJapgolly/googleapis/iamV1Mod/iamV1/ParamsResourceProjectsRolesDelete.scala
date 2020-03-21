package typingsJapgolly.googleapis.iamV1Mod.iamV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRolesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource name of the role in one of the following formats:
    * `organizations/{ORGANIZATION_ID}/roles/{ROLE_NAME}`
    * `projects/{PROJECT_ID}/roles/{ROLE_NAME}`
    */
  var name: js.UndefOr[String] = js.native
}

