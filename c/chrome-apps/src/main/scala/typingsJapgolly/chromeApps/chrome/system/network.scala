package typingsJapgolly.chromeApps.chrome.system

import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////
// System - Network //
//////////////////////
/**
  * The chrome.system.network API.
  * @requires Permissions: 'system.network'
  */
object network {
  
  trait NetworkInterface extends StObject {
    
    /** The available IPv4/6 address. */
    var address: String
    
    /** The underlying name of the adapter. On *nix, this will typically be "eth0", "wlan0", etc. */
    var name: String
    
    /** The prefix length */
    var prefixLength: integer
  }
  object NetworkInterface {
    
    inline def apply(address: String, name: String, prefixLength: integer): NetworkInterface = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterface]
    }
    
    extension [Self <: NetworkInterface](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefixLength(value: integer): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
    }
  }
}
