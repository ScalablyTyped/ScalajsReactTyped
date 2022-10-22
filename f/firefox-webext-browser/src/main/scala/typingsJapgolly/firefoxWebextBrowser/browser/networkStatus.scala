package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability to determine the status of and detect changes in the network connection. This API can only be used in privileged extensions.
  *
  * Permissions: `networkStatus`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object networkStatus {
  
  /* networkStatus types */
  trait NetworkLinkInfo extends StObject {
    
    /** If known, the network id or name. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
    var status: NetworkLinkInfoStatus
    
    /** If known, the type of network connection that is avialable. */
    var `type`: NetworkLinkInfoType
  }
  object NetworkLinkInfo {
    
    inline def apply(status: NetworkLinkInfoStatus, `type`: NetworkLinkInfoType): NetworkLinkInfo = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkLinkInfo]
    }
    
    extension [Self <: NetworkLinkInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setStatus(value: NetworkLinkInfoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: NetworkLinkInfoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.up
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.down
  */
  trait NetworkLinkInfoStatus extends StObject
  object NetworkLinkInfoStatus {
    
    inline def down: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.down = "down".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.down]
    
    inline def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def up: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.up = "up".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.up]
  }
  
  /** If known, the type of network connection that is avialable. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile
  */
  trait NetworkLinkInfoType extends StObject
  object NetworkLinkInfoType {
    
    inline def ethernet: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet = "ethernet".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.ethernet]
    
    inline def mobile: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mobile]
    
    inline def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def usb: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb = "usb".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.usb]
    
    inline def wifi: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi = "wifi".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wifi]
    
    inline def wimax: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax = "wimax".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.wimax]
  }
}
