package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAddress
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonOauthtoken
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressesResource extends js.Object {
  /** Retrieves an aggregated list of addresses. */
  def aggregatedList(request: AnonAlt): Request_[AddressAggregatedList]
  /** Deletes the specified address resource. */
  def delete(request: AnonAddress): Request_[Operation]
  /** Returns the specified address resource. */
  def get(request: AnonOauthtoken): Request_[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of addresses contained within the specified region. */
  def list(request: AnonFilter): Request_[AddressList]
}

object AddressesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[AddressAggregatedList]],
    delete: AnonAddress => CallbackTo[Request_[Operation]],
    get: AnonOauthtoken => CallbackTo[Request_[Address]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[AddressList]]
  ): AddressesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAddress) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[AddressesResource]
  }
}

