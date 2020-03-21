package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountStatics extends js.Object {
  var availableNetworkAccountIds: IVectorView[String]
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount
}

object IMobileBroadbandAccountStatics {
  @scala.inline
  def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => CallbackTo[MobileBroadbandAccount]
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any])
    __obj.updateDynamic("createFromNetworkAccountId")(js.Any.fromFunction1((t0: java.lang.String) => createFromNetworkAccountId(t0).runNow()))
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
}

