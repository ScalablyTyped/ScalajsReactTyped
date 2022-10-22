package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to access information specific to a WWAN connection. */
trait WwanConnectionProfileDetails extends StObject {
  
  /** Indicates the name of the access point used to establish the WWAN connection. */
  var accessPointName: String
  
  /**
    * Indicates the class of data service offered by the network currently in use for the WWAN connection.
    * @return The class of data service currently provided.
    */
  def getCurrentDataClass(): WwanDataClass
  
  /**
    * Retrieves the current network registration state for the WWAN connection.
    * @return The current network registration state.
    */
  def getNetworkRegistrationState(): WwanNetworkRegistrationState
  
  /** Indicates the Home Network Provider ID. */
  var homeProviderId: String
}
object WwanConnectionProfileDetails {
  
  inline def apply(
    accessPointName: String,
    getCurrentDataClass: CallbackTo[WwanDataClass],
    getNetworkRegistrationState: CallbackTo[WwanNetworkRegistrationState],
    homeProviderId: String
  ): WwanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], getCurrentDataClass = getCurrentDataClass.toJsFn, getNetworkRegistrationState = getNetworkRegistrationState.toJsFn, homeProviderId = homeProviderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WwanConnectionProfileDetails]
  }
  
  extension [Self <: WwanConnectionProfileDetails](x: Self) {
    
    inline def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentDataClass(value: CallbackTo[WwanDataClass]): Self = StObject.set(x, "getCurrentDataClass", value.toJsFn)
    
    inline def setGetNetworkRegistrationState(value: CallbackTo[WwanNetworkRegistrationState]): Self = StObject.set(x, "getNetworkRegistrationState", value.toJsFn)
    
    inline def setHomeProviderId(value: String): Self = StObject.set(x, "homeProviderId", value.asInstanceOf[js.Any])
  }
}
