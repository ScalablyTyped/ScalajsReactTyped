package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to access information specific to a WLAN connection. */
trait WlanConnectionProfileDetails extends StObject {
  
  /**
    * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
    * @return The service set identifier (SSID).
    */
  def getConnectedSsid(): String
}
object WlanConnectionProfileDetails {
  
  inline def apply(getConnectedSsid: CallbackTo[String]): WlanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(getConnectedSsid = getConnectedSsid.toJsFn)
    __obj.asInstanceOf[WlanConnectionProfileDetails]
  }
  
  extension [Self <: WlanConnectionProfileDetails](x: Self) {
    
    inline def setGetConnectedSsid(value: CallbackTo[String]): Self = StObject.set(x, "getConnectedSsid", value.toJsFn)
  }
}
