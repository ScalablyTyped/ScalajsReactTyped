package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesNetworkStatusMod {
  
  object NetworkStatus {
    
    trait NetworkLinkInfo extends StObject {
      
      /**
        * If known, the network id or name.
        * Optional.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Status of the network link, if "unknown" then link is usually assumed to be "up"
        */
      var status: NetworkLinkInfoStatusEnum
      
      /**
        * If known, the type of network connection that is avialable.
        */
      var `type`: NetworkLinkInfoTypeEnum
    }
    object NetworkLinkInfo {
      
      inline def apply(status: NetworkLinkInfoStatusEnum, `type`: NetworkLinkInfoTypeEnum): NetworkLinkInfo = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NetworkLinkInfo]
      }
      
      extension [Self <: NetworkLinkInfo](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setStatus(value: NetworkLinkInfoStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setType(value: NetworkLinkInfoTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Status of the network link, if "unknown" then link is usually assumed to be "up"
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.up
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.down
    */
    trait NetworkLinkInfoStatusEnum extends StObject
    object NetworkLinkInfoStatusEnum {
      
      inline def down: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.down = "down".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.down]
      
      inline def unknown: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def up: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.up = "up".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.up]
    }
    
    /**
      * If known, the type of network connection that is avialable.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ethernet
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.usb
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wifi
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wimax
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mobile
    */
    trait NetworkLinkInfoTypeEnum extends StObject
    object NetworkLinkInfoTypeEnum {
      
      inline def ethernet: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ethernet = "ethernet".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ethernet]
      
      inline def mobile: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mobile]
      
      inline def unknown: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def usb: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.usb = "usb".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.usb]
      
      inline def wifi: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wifi = "wifi".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wifi]
      
      inline def wimax: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wimax = "wimax".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.wimax]
    }
    
    trait Static extends StObject {
      
      /**
        * Returns the $(ref:NetworkLinkInfo} of the current network connection.
        */
      def getLinkInfo(): Unit
      
      /**
        * Fired when the network connection state changes.
        *
        * @param details
        */
      var onConnectionChanged: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]
    }
    object Static {
      
      inline def apply(
        getLinkInfo: Callback,
        onConnectionChanged: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(getLinkInfo = getLinkInfo.toJsFn, onConnectionChanged = onConnectionChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGetLinkInfo(value: Callback): Self = StObject.set(x, "getLinkInfo", value.toJsFn)
        
        inline def setOnConnectionChanged(value: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]): Self = StObject.set(x, "onConnectionChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}
