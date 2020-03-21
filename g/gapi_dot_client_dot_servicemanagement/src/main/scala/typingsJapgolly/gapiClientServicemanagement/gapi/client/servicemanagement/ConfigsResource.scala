package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientServicemanagement.AnonBearertoken
import typingsJapgolly.gapiClientServicemanagement.AnonCallback
import typingsJapgolly.gapiClientServicemanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigsResource extends js.Object {
  /**
    * Creates a new service configuration (version) for a managed service.
    * This method only stores the service configuration. To roll out the service
    * configuration to backend systems please call
    * CreateServiceRollout.
    */
  def create(request: AnonBearertoken): Request_[Service]
  /** Gets a service configuration (version) for a managed service. */
  def get(request: AnonCallback): Request_[Service]
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: AnonFields): Request_[ListServiceConfigsResponse]
  /**
    * Creates a new service configuration (version) for a managed service based
    * on
    * user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as the
    * generated service configuration. To rollout the service configuration to
    * other services,
    * please call CreateServiceRollout.
    *
    * Operation<response: SubmitConfigSourceResponse>
    */
  def submit(request: AnonBearertoken): Request_[Operation]
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => CallbackTo[Request_[Service]],
    get: AnonCallback => CallbackTo[Request_[Service]],
    list: AnonFields => CallbackTo[Request_[ListServiceConfigsResponse]],
    submit: AnonBearertoken => CallbackTo[Request_[Operation]]
  ): ConfigsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServicemanagement.AnonBearertoken) => submit(t0).runNow()))
    __obj.asInstanceOf[ConfigsResource]
  }
}

