package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsForwardingRule
import typingsJapgolly.gapiClientCompute.AnonForwardingRuleKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: AnonFieldsForwardingRule): Request_[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: AnonForwardingRuleKey): Request_[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: AnonAlt): Request_[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: AnonFieldsForwardingRule): Request_[Operation]
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: AnonFieldsForwardingRule => CallbackTo[Request_[Operation]],
    get: AnonForwardingRuleKey => CallbackTo[Request_[ForwardingRule]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[ForwardingRuleList]],
    setTarget: AnonFieldsForwardingRule => CallbackTo[Request_[Operation]]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsForwardingRule) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonForwardingRuleKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setTarget")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsForwardingRule) => setTarget(t0).runNow()))
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
}

