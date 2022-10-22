package typingsJapgolly.naverWhale.whale

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
    - typingsJapgolly.naverWhale.naverWhaleStrings.active
    - typingsJapgolly.naverWhale.naverWhaleStrings.idle
    - typingsJapgolly.naverWhale.naverWhaleStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typingsJapgolly.naverWhale.naverWhaleStrings.active = "active".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.active]
    
    inline def idle: typingsJapgolly.naverWhale.naverWhaleStrings.idle = "idle".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.idle]
    
    inline def locked: typingsJapgolly.naverWhale.naverWhaleStrings.locked = "locked".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ typingsJapgolly.chrome.chrome.idle.IdleState, Unit]]
}
