package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonAccesstoken
import typingsJapgolly.gapiClientAppengine.AnonCallback
import typingsJapgolly.gapiClientAppengine.AnonDomainMappingsId
import typingsJapgolly.gapiClientAppengine.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainMappingsResource extends js.Object {
  /**
    * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available
    * authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
    */
  def create(request: AnonAccesstoken): Request_[Operation]
  /** Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource. */
  def delete(request: AnonDomainMappingsId): Request_[Operation]
  /** Gets the specified domain mapping. */
  def get(request: AnonDomainMappingsId): Request_[DomainMapping]
  /** Lists the domain mappings on an application. */
  def list(request: AnonCallback): Request_[ListDomainMappingsResponse]
  /**
    * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate
    * resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
    */
  def patch(request: AnonFields): Request_[Operation]
}

object DomainMappingsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[Operation]],
    delete: AnonDomainMappingsId => CallbackTo[Request_[Operation]],
    get: AnonDomainMappingsId => CallbackTo[Request_[DomainMapping]],
    list: AnonCallback => CallbackTo[Request_[ListDomainMappingsResponse]],
    patch: AnonFields => CallbackTo[Request_[Operation]]
  ): DomainMappingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonDomainMappingsId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonDomainMappingsId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonCallback) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[DomainMappingsResource]
  }
}

