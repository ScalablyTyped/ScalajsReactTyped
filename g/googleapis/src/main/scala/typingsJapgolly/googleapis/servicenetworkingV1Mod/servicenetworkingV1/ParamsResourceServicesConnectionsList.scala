package typingsJapgolly.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesConnectionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of service consumer's VPC network that's connected with service
    * producer network through a private connection. The network name must be
    * in the following format: `projects/{project}/global/networks/{network}`.
    * {project} is a project number, such as in `12345` that includes the VPC
    * service consumer's VPC network. {network} is the name of the service
    * consumer's VPC network.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The service that is managing peering connectivity for a service
    * producer's organization. For Google services that support this
    * functionality, this value is `services/servicenetworking.googleapis.com`.
    * If you specify `services/-` as the parameter value, all configured
    * peering services are listed.
    */
  var parent: js.UndefOr[String] = js.native
}

