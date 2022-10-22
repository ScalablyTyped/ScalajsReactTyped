package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability detect the captive portal state of the users connection.
  *
  * Permissions: `captivePortal`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object captivePortal {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear
  */
  trait OnConnectivityAvailableStatus extends StObject
  object OnConnectivityAvailableStatus {
    
    inline def captive: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive = "captive".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.captive]
    
    inline def clear: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear = "clear".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.clear]
  }
  
  trait OnStateChangedDetails extends StObject {
    
    /** The current captive portal state. */
    var state: OnStateChangedDetailsState
  }
  object OnStateChangedDetails {
    
    inline def apply(state: OnStateChangedDetailsState): OnStateChangedDetails = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStateChangedDetails]
    }
    
    extension [Self <: OnStateChangedDetails](x: Self) {
      
      inline def setState(value: OnStateChangedDetailsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /** The current captive portal state. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal
  */
  trait OnStateChangedDetailsState extends StObject
  object OnStateChangedDetailsState {
    
    inline def locked_portal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal = "locked_portal".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal]
    
    inline def not_captive: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive = "not_captive".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive]
    
    inline def unknown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    
    inline def unlocked_portal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal]
  }
}
