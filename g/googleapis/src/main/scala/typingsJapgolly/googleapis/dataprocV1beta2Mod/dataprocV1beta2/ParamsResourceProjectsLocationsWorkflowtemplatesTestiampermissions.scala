package typingsJapgolly.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsWorkflowtemplatesTestiampermissions extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTestIamPermissionsRequest] = js.native
  /**
    * REQUIRED: The resource for which the policy detail is being requested.
    * See the operation documentation for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.native
}

