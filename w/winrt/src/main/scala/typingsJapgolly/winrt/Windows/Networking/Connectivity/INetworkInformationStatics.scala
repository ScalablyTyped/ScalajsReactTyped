package typingsJapgolly.winrt.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Networking.EndpointPair
import typingsJapgolly.winrt.Windows.Networking.HostName
import typingsJapgolly.winrt.Windows.Networking.HostNameSortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkInformationStatics extends StObject {
  
  def getConnectionProfiles(): IVectorView[ConnectionProfile]
  
  def getHostNames(): IVectorView[HostName]
  
  def getInternetConnectionProfile(): ConnectionProfile
  
  def getLanIdentifiers(): IVectorView[LanIdentifier]
  
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration]
  
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair]
  
  var onnetworkstatuschanged: Any
}
object INetworkInformationStatics {
  
  inline def apply(
    getConnectionProfiles: CallbackTo[IVectorView[ConnectionProfile]],
    getHostNames: CallbackTo[IVectorView[HostName]],
    getInternetConnectionProfile: CallbackTo[ConnectionProfile],
    getLanIdentifiers: CallbackTo[IVectorView[LanIdentifier]],
    getProxyConfigurationAsync: Uri => IAsyncOperation[ProxyConfiguration],
    getSortedEndpointPairs: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair],
    onnetworkstatuschanged: Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(getConnectionProfiles = getConnectionProfiles.toJsFn, getHostNames = getHostNames.toJsFn, getInternetConnectionProfile = getInternetConnectionProfile.toJsFn, getLanIdentifiers = getLanIdentifiers.toJsFn, getProxyConfigurationAsync = js.Any.fromFunction1(getProxyConfigurationAsync), getSortedEndpointPairs = js.Any.fromFunction2(getSortedEndpointPairs), onnetworkstatuschanged = onnetworkstatuschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkInformationStatics]
  }
  
  extension [Self <: INetworkInformationStatics](x: Self) {
    
    inline def setGetConnectionProfiles(value: CallbackTo[IVectorView[ConnectionProfile]]): Self = StObject.set(x, "getConnectionProfiles", value.toJsFn)
    
    inline def setGetHostNames(value: CallbackTo[IVectorView[HostName]]): Self = StObject.set(x, "getHostNames", value.toJsFn)
    
    inline def setGetInternetConnectionProfile(value: CallbackTo[ConnectionProfile]): Self = StObject.set(x, "getInternetConnectionProfile", value.toJsFn)
    
    inline def setGetLanIdentifiers(value: CallbackTo[IVectorView[LanIdentifier]]): Self = StObject.set(x, "getLanIdentifiers", value.toJsFn)
    
    inline def setGetProxyConfigurationAsync(value: Uri => IAsyncOperation[ProxyConfiguration]): Self = StObject.set(x, "getProxyConfigurationAsync", js.Any.fromFunction1(value))
    
    inline def setGetSortedEndpointPairs(value: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair]): Self = StObject.set(x, "getSortedEndpointPairs", js.Any.fromFunction2(value))
    
    inline def setOnnetworkstatuschanged(value: Any): Self = StObject.set(x, "onnetworkstatuschanged", value.asInstanceOf[js.Any])
  }
}
