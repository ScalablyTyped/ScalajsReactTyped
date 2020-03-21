package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsFirewall
import typingsJapgolly.gapiClientCompute.AnonFirewall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: AnonFirewall): Request_[Operation]
  /** Returns the specified firewall. */
  def get(request: AnonFieldsFirewall): Request_[Firewall]
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: AnonAlt): Request_[FirewallList]
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: AnonFirewall): Request_[Operation]
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: AnonFirewall): Request_[Operation]
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: AnonFirewall => CallbackTo[Request_[Operation]],
    get: AnonFieldsFirewall => CallbackTo[Request_[Firewall]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[FirewallList]],
    patch: AnonFirewall => CallbackTo[Request_[Operation]],
    update: AnonFirewall => CallbackTo[Request_[Operation]]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFirewall) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsFirewall) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFirewall) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFirewall) => update(t0).runNow()))
    __obj.asInstanceOf[FirewallsResource]
  }
}

