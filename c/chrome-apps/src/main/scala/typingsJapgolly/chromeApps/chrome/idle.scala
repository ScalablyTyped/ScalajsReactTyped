package typingsJapgolly.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.idle
//////////
// Idle //
//////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * @requires Permissions: 'idle'
  * @since Chrome 25.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.active
    - typingsJapgolly.chromeApps.chromeAppsStrings.idle
    - typingsJapgolly.chromeApps.chromeAppsStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typingsJapgolly.chromeApps.chromeAppsStrings.active = "active".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.active]
    
    inline def idle: typingsJapgolly.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.idle]
    
    inline def locked: typingsJapgolly.chromeApps.chromeAppsStrings.locked = "locked".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.locked]
  }
}
