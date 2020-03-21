package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAppengine.AnonAccesstoken
import typingsJapgolly.gapiClientAppengine.AnonIngressRulesId
import typingsJapgolly.gapiClientAppengine.AnonKey
import typingsJapgolly.gapiClientAppengine.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngressRulesResource extends js.Object {
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
    * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: AnonAccesstoken): Request_[BatchUpdateIngressRulesResponse]
  /** Creates a firewall rule for the application. */
  def create(request: AnonAccesstoken): Request_[FirewallRule]
  /** Deletes the specified firewall rule. */
  def delete(request: AnonIngressRulesId): Request_[js.Object]
  /** Gets the specified firewall rule. */
  def get(request: AnonIngressRulesId): Request_[FirewallRule]
  /** Lists the firewall rules of an application. */
  def list(request: AnonKey): Request_[ListIngressRulesResponse]
  /** Updates the specified firewall rule. */
  def patch(request: AnonOauthtoken): Request_[FirewallRule]
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: AnonAccesstoken => CallbackTo[Request_[BatchUpdateIngressRulesResponse]],
    create: AnonAccesstoken => CallbackTo[Request_[FirewallRule]],
    delete: AnonIngressRulesId => CallbackTo[Request_[js.Object]],
    get: AnonIngressRulesId => CallbackTo[Request_[FirewallRule]],
    list: AnonKey => CallbackTo[Request_[ListIngressRulesResponse]],
    patch: AnonOauthtoken => CallbackTo[Request_[FirewallRule]]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => batchUpdate(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonIngressRulesId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonIngressRulesId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAppengine.AnonOauthtoken) => patch(t0).runNow()))
    __obj.asInstanceOf[IngressRulesResource]
  }
}

