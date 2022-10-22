package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.idle` API to detect when the machine's idle state changes.
  *
  * Permissions: `idle`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object idle {
  
  /* idle types */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active = "active".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.active]
    
    inline def idle: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle = "idle".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle]
  }
}
