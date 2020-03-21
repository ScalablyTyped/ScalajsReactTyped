package typingsJapgolly.winrt.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.EndpointPair
import typingsJapgolly.winrt.Windows.Networking.HostName
import typingsJapgolly.winrt.Windows.Networking.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationStatics extends js.Object {
  var onnetworkstatuschanged: js.Any
  def getConnectionProfiles(): IVectorView[ConnectionProfile]
  def getHostNames(): IVectorView[HostName]
  def getInternetConnectionProfile(): ConnectionProfile
  def getLanIdentifiers(): IVectorView[LanIdentifier]
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration]
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair]
}

object INetworkInformationStatics {
  @scala.inline
  def apply(
    getConnectionProfiles: CallbackTo[IVectorView[ConnectionProfile]],
    getHostNames: CallbackTo[IVectorView[HostName]],
    getInternetConnectionProfile: CallbackTo[ConnectionProfile],
    getLanIdentifiers: CallbackTo[IVectorView[LanIdentifier]],
    getProxyConfigurationAsync: Uri => CallbackTo[IAsyncOperation[ProxyConfiguration]],
    getSortedEndpointPairs: (IIterable[EndpointPair], HostNameSortOptions) => CallbackTo[IVectorView[EndpointPair]],
    onnetworkstatuschanged: js.Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(onnetworkstatuschanged = onnetworkstatuschanged.asInstanceOf[js.Any])
    __obj.updateDynamic("getConnectionProfiles")(getConnectionProfiles.toJsFn)
    __obj.updateDynamic("getHostNames")(getHostNames.toJsFn)
    __obj.updateDynamic("getInternetConnectionProfile")(getInternetConnectionProfile.toJsFn)
    __obj.updateDynamic("getLanIdentifiers")(getLanIdentifiers.toJsFn)
    __obj.updateDynamic("getProxyConfigurationAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Uri) => getProxyConfigurationAsync(t0).runNow()))
    __obj.updateDynamic("getSortedEndpointPairs")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.Networking.EndpointPair], t1: typingsJapgolly.winrt.Windows.Networking.HostNameSortOptions) => getSortedEndpointPairs(t0, t1).runNow()))
    __obj.asInstanceOf[INetworkInformationStatics]
  }
}

