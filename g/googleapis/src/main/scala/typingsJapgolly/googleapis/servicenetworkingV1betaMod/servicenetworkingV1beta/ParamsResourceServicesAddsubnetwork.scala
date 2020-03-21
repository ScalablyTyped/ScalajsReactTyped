package typingsJapgolly.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesAddsubnetwork extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. A tenant project in the service producer organization, in the
    * following format: services/{service}/{collection-id}/{resource-id}.
    * {collection-id} is the cloud resource collection type that represents the
    * tenant project. Only `projects` are supported. {resource-id} is the
    * tenant project numeric id, such as `123456`. {service} the name of the
    * peering service, such as `service-peering.example.com`. This service must
    * already be enabled in the service consumer's project.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddSubnetworkRequest] = js.native
}

