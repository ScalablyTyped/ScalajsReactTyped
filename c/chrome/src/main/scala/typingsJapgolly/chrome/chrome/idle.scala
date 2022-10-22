package typingsJapgolly.chrome.chrome

import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chrome.chromeStrings.active
    - typingsJapgolly.chrome.chromeStrings.idle
    - typingsJapgolly.chrome.chromeStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typingsJapgolly.chrome.chromeStrings.active = "active".asInstanceOf[typingsJapgolly.chrome.chromeStrings.active]
    
    inline def idle: typingsJapgolly.chrome.chromeStrings.idle = "idle".asInstanceOf[typingsJapgolly.chrome.chromeStrings.idle]
    
    inline def locked: typingsJapgolly.chrome.chromeStrings.locked = "locked".asInstanceOf[typingsJapgolly.chrome.chromeStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ IdleState, Unit]]
}
