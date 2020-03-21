package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisioningAgentStaticMethods extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): ProvisioningAgent
}

object IProvisioningAgentStaticMethods {
  @scala.inline
  def apply(createFromNetworkAccountId: String => CallbackTo[ProvisioningAgent]): IProvisioningAgentStaticMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromNetworkAccountId")(js.Any.fromFunction1((t0: java.lang.String) => createFromNetworkAccountId(t0).runNow()))
    __obj.asInstanceOf[IProvisioningAgentStaticMethods]
  }
}

