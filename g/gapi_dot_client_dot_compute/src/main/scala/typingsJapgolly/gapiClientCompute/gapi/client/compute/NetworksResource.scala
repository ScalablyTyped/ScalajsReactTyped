package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonKeyNetwork
import typingsJapgolly.gapiClientCompute.AnonNetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksResource extends js.Object {
  /** Adds a peering to the specified network. */
  def addPeering(request: AnonNetwork): Request_[Operation]
  /** Deletes the specified network. */
  def delete(request: AnonNetwork): Request_[Operation]
  /** Returns the specified network. Get a list of available networks by making a list() request. */
  def get(request: AnonKeyNetwork): Request_[Network]
  /** Creates a network in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of networks available to the specified project. */
  def list(request: AnonAlt): Request_[NetworkList]
  /** Patches the specified network with the data included in the request. */
  def patch(request: AnonNetwork): Request_[Operation]
  /** Removes a peering from the specified network. */
  def removePeering(request: AnonNetwork): Request_[Operation]
  /** Switches the network mode from auto subnet mode to custom subnet mode. */
  def switchToCustomMode(request: AnonNetwork): Request_[Operation]
}

object NetworksResource {
  @scala.inline
  def apply(
    addPeering: AnonNetwork => CallbackTo[Request_[Operation]],
    delete: AnonNetwork => CallbackTo[Request_[Operation]],
    get: AnonKeyNetwork => CallbackTo[Request_[Network]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[NetworkList]],
    patch: AnonNetwork => CallbackTo[Request_[Operation]],
    removePeering: AnonNetwork => CallbackTo[Request_[Operation]],
    switchToCustomMode: AnonNetwork => CallbackTo[Request_[Operation]]
  ): NetworksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPeering")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonNetwork) => addPeering(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonNetwork) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonKeyNetwork) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonNetwork) => patch(t0).runNow()))
    __obj.updateDynamic("removePeering")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonNetwork) => removePeering(t0).runNow()))
    __obj.updateDynamic("switchToCustomMode")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonNetwork) => switchToCustomMode(t0).runNow()))
    __obj.asInstanceOf[NetworksResource]
  }
}

