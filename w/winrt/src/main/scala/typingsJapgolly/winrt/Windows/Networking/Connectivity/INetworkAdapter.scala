package typingsJapgolly.winrt.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkAdapter extends js.Object {
  var ianaInterfaceType: Double
  var inboundMaxBitsPerSecond: Double
  var networkAdapterId: String
  var networkItem: NetworkItem
  var outboundMaxBitsPerSecond: Double
  def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile]
}

object INetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: CallbackTo[IAsyncOperation[ConnectionProfile]],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal(ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.updateDynamic("getConnectedProfileAsync")(getConnectedProfileAsync.toJsFn)
    __obj.asInstanceOf[INetworkAdapter]
  }
}

