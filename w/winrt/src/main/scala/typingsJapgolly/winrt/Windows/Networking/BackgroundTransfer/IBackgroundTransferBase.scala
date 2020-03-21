package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferBase extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: String
  var method: String
  var proxyCredential: PasswordCredential
  var serverCredential: PasswordCredential
  def setRequestHeader(headerName: String, headerValue: String): Unit
}

object IBackgroundTransferBase {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    group: String,
    method: String,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Callback
  ): IBackgroundTransferBase = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any])
    __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setRequestHeader(t0, t1).runNow()))
    __obj.asInstanceOf[IBackgroundTransferBase]
  }
}

