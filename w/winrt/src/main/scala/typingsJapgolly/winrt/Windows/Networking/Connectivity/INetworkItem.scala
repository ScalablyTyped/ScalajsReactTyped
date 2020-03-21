package typingsJapgolly.winrt.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkItem extends js.Object {
  var networkId: String
  def getNetworkTypes(): NetworkTypes
}

object INetworkItem {
  @scala.inline
  def apply(getNetworkTypes: CallbackTo[NetworkTypes], networkId: String): INetworkItem = {
    val __obj = js.Dynamic.literal(networkId = networkId.asInstanceOf[js.Any])
    __obj.updateDynamic("getNetworkTypes")(getNetworkTypes.toJsFn)
    __obj.asInstanceOf[INetworkItem]
  }
}

