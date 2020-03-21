package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFilter
import typingsJapgolly.gapiClientCompute.AnonForwardingRule
import typingsJapgolly.gapiClientCompute.AnonPrettyPrint
import typingsJapgolly.gapiClientCompute.AnonRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: AnonAlt): Request_[ForwardingRuleAggregatedList]
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: AnonForwardingRule): Request_[Operation]
  /** Returns the specified ForwardingRule resource. */
  def get(request: AnonRegion): Request_[ForwardingRule]
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: AnonFilter): Request_[ForwardingRuleList]
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: AnonForwardingRule): Request_[Operation]
}

object ForwardingRulesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => CallbackTo[Request_[ForwardingRuleAggregatedList]],
    delete: AnonForwardingRule => CallbackTo[Request_[Operation]],
    get: AnonRegion => CallbackTo[Request_[ForwardingRule]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[ForwardingRuleList]],
    setTarget: AnonForwardingRule => CallbackTo[Request_[Operation]]
  ): ForwardingRulesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => aggregatedList(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonForwardingRule) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonRegion) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("setTarget")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonForwardingRule) => setTarget(t0).runNow()))
    __obj.asInstanceOf[ForwardingRulesResource]
  }
}

