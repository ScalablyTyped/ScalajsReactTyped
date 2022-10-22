package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet

import typingsJapgolly.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents relevant location data for a wallet item. */
trait WalletRelevantLocation extends StObject {
  
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: String
  
  /** Gets or sets the basic geographic position information of the location. */
  var position: BasicGeoposition
}
object WalletRelevantLocation {
  
  inline def apply(displayMessage: String, position: BasicGeoposition): WalletRelevantLocation = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRelevantLocation]
  }
  
  extension [Self <: WalletRelevantLocation](x: Self) {
    
    inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: BasicGeoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
