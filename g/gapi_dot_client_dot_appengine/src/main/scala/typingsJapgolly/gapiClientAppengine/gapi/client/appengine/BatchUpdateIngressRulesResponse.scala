package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateIngressRulesResponse extends js.Object {
  /** The full list of ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
}

object BatchUpdateIngressRulesResponse {
  @scala.inline
  def apply(ingressRules: js.Array[FirewallRule] = null): BatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ingressRules != null) __obj.updateDynamic("ingressRules")(ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateIngressRulesResponse]
  }
}

