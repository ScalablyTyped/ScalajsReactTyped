package typingsJapgolly.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesPrivacyMod {
  
  object Privacy {
    
    trait Static extends StObject {
      
      var network: typingsJapgolly.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static
      
      var services: typingsJapgolly.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static
      
      var websites: typingsJapgolly.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static
    }
    object Static {
      
      inline def apply(
        network: typingsJapgolly.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static,
        services: typingsJapgolly.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static,
        websites: typingsJapgolly.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static
      ): Static = {
        val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setNetwork(value: typingsJapgolly.webextensionPolyfill.namespacesPrivacyNetworkMod.PrivacyNetwork.Static): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
        
        inline def setServices(value: typingsJapgolly.webextensionPolyfill.namespacesPrivacyServicesMod.PrivacyServices.Static): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
        
        inline def setWebsites(value: typingsJapgolly.webextensionPolyfill.namespacesPrivacyWebsitesMod.PrivacyWebsites.Static): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
      }
    }
  }
}
