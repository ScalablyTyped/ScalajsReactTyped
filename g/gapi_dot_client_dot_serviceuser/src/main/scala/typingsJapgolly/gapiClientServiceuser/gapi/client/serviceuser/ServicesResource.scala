package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientServiceuser.AnonAccesstoken
import typingsJapgolly.gapiClientServiceuser.AnonAlt
import typingsJapgolly.gapiClientServiceuser.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  /**
    * Disable a service so it can no longer be used with a
    * project. This prevents unintended usage that may cause unexpected billing
    * charges or security leaks.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def disable(request: AnonAccesstoken): Request_[Operation]
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: AnonAccesstoken): Request_[Operation]
  /** List enabled services for the specified consumer. */
  def list(request: AnonAlt): Request_[ListEnabledServicesResponse]
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: AnonBearertoken): Request_[SearchServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: AnonAccesstoken => CallbackTo[Request_[Operation]],
    enable: AnonAccesstoken => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[ListEnabledServicesResponse]],
    search: AnonBearertoken => CallbackTo[Request_[SearchServicesResponse]]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServiceuser.AnonAccesstoken) => disable(t0).runNow()))
    __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServiceuser.AnonAccesstoken) => enable(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServiceuser.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientServiceuser.AnonBearertoken) => search(t0).runNow()))
    __obj.asInstanceOf[ServicesResource]
  }
}

