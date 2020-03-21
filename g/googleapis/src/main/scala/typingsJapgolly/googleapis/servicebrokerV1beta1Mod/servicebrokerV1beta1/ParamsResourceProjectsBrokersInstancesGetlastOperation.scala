package typingsJapgolly.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsBrokersInstancesGetlastOperation extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/`+
    * `service_instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If `operation` was returned during mutation operation, this field must be
    * populated with the provided value.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * Plan id.
    */
  var planId: js.UndefOr[String] = js.native
  /**
    * Service id.
    */
  var serviceId: js.UndefOr[String] = js.native
}

