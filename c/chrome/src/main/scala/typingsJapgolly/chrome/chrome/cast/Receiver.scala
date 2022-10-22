package typingsJapgolly.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receiver extends StObject {
  
  var capabilities: js.Array[Capability]
  
  var displayStatus: ReceiverDisplayStatus
  
  var friendlyName: String
  
  var label: String
  
  var receiverType: ReceiverType
  
  var volume: Volume
}
object Receiver {
  
  inline def apply(
    capabilities: js.Array[Capability],
    displayStatus: ReceiverDisplayStatus,
    friendlyName: String,
    label: String,
    receiverType: ReceiverType,
    volume: Volume
  ): Receiver = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], receiverType = receiverType.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  
  extension [Self <: Receiver](x: Self) {
    
    inline def setCapabilities(value: js.Array[Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setDisplayStatus(value: ReceiverDisplayStatus): Self = StObject.set(x, "displayStatus", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setReceiverType(value: ReceiverType): Self = StObject.set(x, "receiverType", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
