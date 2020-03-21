package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceProvider extends js.Object {
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse]
  def handleFirewallRule(errorCode: Double, errorMessage: String, connectionTypeId: String): Thenable[HandleFirewallRuleResponse]
}

object ResourceProvider {
  @scala.inline
  def apply(
    createFirewallRule: (Account, FirewallRuleInfo) => CallbackTo[Thenable[CreateFirewallRuleResponse]],
    handleFirewallRule: (Double, String, String) => CallbackTo[Thenable[HandleFirewallRuleResponse]]
  ): ResourceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFirewallRule")(js.Any.fromFunction2((t0: typingsJapgolly.azdata.mod.Account, t1: typingsJapgolly.azdata.mod.FirewallRuleInfo) => createFirewallRule(t0, t1).runNow()))
    __obj.updateDynamic("handleFirewallRule")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => handleFirewallRule(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ResourceProvider]
  }
}

