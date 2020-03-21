package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAddressAlt
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalAddressesResource extends js.Object {
  /** Deletes the specified address resource. */
  def delete(request: AnonAddressAlt): Request_[Operation]
  /** Returns the specified address resource. Get a list of available addresses by making a list() request. */
  def get(request: AnonFieldsKey): Request_[Address]
  /** Creates an address resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of global addresses. */
  def list(request: AnonAlt): Request_[AddressList]
}

object GlobalAddressesResource {
  @scala.inline
  def apply(
    delete: AnonAddressAlt => CallbackTo[Request_[Operation]],
    get: AnonFieldsKey => CallbackTo[Request_[Address]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[AddressList]]
  ): GlobalAddressesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAddressAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[GlobalAddressesResource]
  }
}

