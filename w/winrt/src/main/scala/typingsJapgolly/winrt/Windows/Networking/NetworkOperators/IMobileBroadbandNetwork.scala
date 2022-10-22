package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandNetwork extends StObject {
  
  var accessPointName: String
  
  var activationNetworkError: Double
  
  var networkAdapter: NetworkAdapter
  
  var networkRegistrationState: NetworkRegistrationState
  
  var packetAttachNetworkError: Double
  
  var registeredDataClass: DataClasses
  
  var registeredProviderId: String
  
  var registeredProviderName: String
  
  var registrationNetworkError: Double
  
  def showConnectionUI(): Unit
}
object IMobileBroadbandNetwork {
  
  inline def apply(
    accessPointName: String,
    activationNetworkError: Double,
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    showConnectionUI: Callback
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], showConnectionUI = showConnectionUI.toJsFn)
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
  
  extension [Self <: IMobileBroadbandNetwork](x: Self) {
    
    inline def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    inline def setActivationNetworkError(value: Double): Self = StObject.set(x, "activationNetworkError", value.asInstanceOf[js.Any])
    
    inline def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    inline def setNetworkRegistrationState(value: NetworkRegistrationState): Self = StObject.set(x, "networkRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setPacketAttachNetworkError(value: Double): Self = StObject.set(x, "packetAttachNetworkError", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDataClass(value: DataClasses): Self = StObject.set(x, "registeredDataClass", value.asInstanceOf[js.Any])
    
    inline def setRegisteredProviderId(value: String): Self = StObject.set(x, "registeredProviderId", value.asInstanceOf[js.Any])
    
    inline def setRegisteredProviderName(value: String): Self = StObject.set(x, "registeredProviderName", value.asInstanceOf[js.Any])
    
    inline def setRegistrationNetworkError(value: Double): Self = StObject.set(x, "registrationNetworkError", value.asInstanceOf[js.Any])
    
    inline def setShowConnectionUI(value: Callback): Self = StObject.set(x, "showConnectionUI", value.toJsFn)
  }
}
