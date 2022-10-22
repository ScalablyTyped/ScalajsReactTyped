package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Rich Communication Services (RCS) chat capabilities of a phone number. */
trait ChatCapabilities extends StObject {
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) chat. */
  var isChatCapable: Boolean
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) file transfer. */
  var isFileTransferCapable: Boolean
  
  /** Gets a Boolean value indicating if a phone number is capable of pushing Rich Communication Services (RCS) geolocation. */
  var isGeoLocationPushCapable: Boolean
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) integrated messaging. */
  var isIntegratedMessagingCapable: Boolean
  
  /** Gets a Boolean value indicating if an Rich Communication Services (RCS) capable phone number is online. */
  var isOnline: Boolean
}
object ChatCapabilities {
  
  inline def apply(
    isChatCapable: Boolean,
    isFileTransferCapable: Boolean,
    isGeoLocationPushCapable: Boolean,
    isIntegratedMessagingCapable: Boolean,
    isOnline: Boolean
  ): ChatCapabilities = {
    val __obj = js.Dynamic.literal(isChatCapable = isChatCapable.asInstanceOf[js.Any], isFileTransferCapable = isFileTransferCapable.asInstanceOf[js.Any], isGeoLocationPushCapable = isGeoLocationPushCapable.asInstanceOf[js.Any], isIntegratedMessagingCapable = isIntegratedMessagingCapable.asInstanceOf[js.Any], isOnline = isOnline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatCapabilities]
  }
  
  extension [Self <: ChatCapabilities](x: Self) {
    
    inline def setIsChatCapable(value: Boolean): Self = StObject.set(x, "isChatCapable", value.asInstanceOf[js.Any])
    
    inline def setIsFileTransferCapable(value: Boolean): Self = StObject.set(x, "isFileTransferCapable", value.asInstanceOf[js.Any])
    
    inline def setIsGeoLocationPushCapable(value: Boolean): Self = StObject.set(x, "isGeoLocationPushCapable", value.asInstanceOf[js.Any])
    
    inline def setIsIntegratedMessagingCapable(value: Boolean): Self = StObject.set(x, "isIntegratedMessagingCapable", value.asInstanceOf[js.Any])
    
    inline def setIsOnline(value: Boolean): Self = StObject.set(x, "isOnline", value.asInstanceOf[js.Any])
  }
}
