package typingsJapgolly.vscodeDebugprotocol.anon

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.`new`
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.changed
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoint extends StObject {
  
  /** The `id` attribute is used to find the target breakpoint, the other attributes are used as the new values. */
  var breakpoint: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint
  
  /** The reason for the event.
  				Values: 'changed', 'new', 'removed', etc.
  			*/
  var reason: changed | `new` | removed | String
}
object Breakpoint {
  
  inline def apply(
    breakpoint: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint,
    reason: changed | `new` | removed | String
  ): Breakpoint = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
  
  extension [Self <: Breakpoint](x: Self) {
    
    inline def setBreakpoint(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setReason(value: changed | `new` | removed | String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
