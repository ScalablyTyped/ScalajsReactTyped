package typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBrokersV2ServiceInstancesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the instance to return. Name must match
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/` +
    * `v2/service_instances/[INSTANCE_ID]` or
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
}

