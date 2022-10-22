package typingsJapgolly.chromeApps.chrome.networking.onc

import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiMAXProperties[M /* <: ManagedObject */, B] extends StObject {
  
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
}
object WiMAXProperties {
  
  inline def apply[M /* <: ManagedObject */, B](): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
  
  extension [Self <: WiMAXProperties[?, ?], M /* <: ManagedObject */, B](x: Self & (WiMAXProperties[M, B])) {
    
    inline def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    inline def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    inline def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
    
    inline def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    inline def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
