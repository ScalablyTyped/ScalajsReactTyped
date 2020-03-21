package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientServicemanagement.AnonBearertoken
import typingsJapgolly.gapiClientServicemanagement.AnonFilter
import typingsJapgolly.gapiClientServicemanagement.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolloutsResource extends js.Object {
  /**
    * Creates a new service configuration rollout. Based on rollout, the
    * Google Service Management will roll out the service configurations to
    * different backend services. For example, the logging configuration will be
    * pushed to Google Cloud Logging.
    *
    * Please note that any previous pending and running Rollouts and associated
    * Operations will be automatically cancelled so that the latest Rollout will
    * not be blocked by previous Rollouts.
    *
    * Operation<response: Rollout>
    */
  def create(request: AnonBearertoken): Request_[Operation]
  /** Gets a service configuration rollout. */
  def get(request: AnonOauthtoken): Request_[Rollout]
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: AnonFilter): Request_[ListServiceRolloutsResponse]
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[Operation]],
    get: AnonOauthtoken => CallbackTo[Request_[Rollout]],
    list: AnonFilter => CallbackTo[Request_[ListServiceRolloutsResponse]]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[RolloutsResource]
  }
}

