package typingsJapgolly.googleapis.servicecontrolV1Mod.servicecontrolV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesAllocatequota extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAllocateQuotaRequest] = js.native
  /**
    * Name of the service as specified in the service configuration. For
    * example, `"pubsub.googleapis.com"`.  See google.api.Service for the
    * definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.native
}

