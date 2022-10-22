package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband account and related information about the network provider for the account. */
trait MobileBroadbandAccount extends StObject {
  
  /** Gets the mobile broadband device information associated with this account. */
  var currentDeviceInformation: MobileBroadbandDeviceInformation
  
  /** Gets the Mobile Broadband network object for this account. */
  var currentNetwork: MobileBroadbandNetwork
  
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): IVectorView[ConnectionProfile]
  
  /** Gets a unique identifier for the mobile broadband account. */
  var networkAccountId: String
  
  /** A unique identifier for the network provider for the mobile broadband account. */
  var serviceProviderGuid: String
  
  /** The name of the network provider for the mobile broadband account. */
  var serviceProviderName: String
}
object MobileBroadbandAccount {
  
  inline def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    getConnectionProfiles: CallbackTo[IVectorView[ConnectionProfile]],
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): MobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], getConnectionProfiles = getConnectionProfiles.toJsFn, networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccount]
  }
  
  extension [Self <: MobileBroadbandAccount](x: Self) {
    
    inline def setCurrentDeviceInformation(value: MobileBroadbandDeviceInformation): Self = StObject.set(x, "currentDeviceInformation", value.asInstanceOf[js.Any])
    
    inline def setCurrentNetwork(value: MobileBroadbandNetwork): Self = StObject.set(x, "currentNetwork", value.asInstanceOf[js.Any])
    
    inline def setGetConnectionProfiles(value: CallbackTo[IVectorView[ConnectionProfile]]): Self = StObject.set(x, "getConnectionProfiles", value.toJsFn)
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderGuid(value: String): Self = StObject.set(x, "serviceProviderGuid", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderName(value: String): Self = StObject.set(x, "serviceProviderName", value.asInstanceOf[js.Any])
  }
}
