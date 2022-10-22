package typingsJapgolly.vscodeDebugprotocol.anon

import typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.BreakpointLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakpoints extends StObject {
  
  /** Sorted set of possible breakpoint locations. */
  var breakpoints: js.Array[BreakpointLocation]
}
object Breakpoints {
  
  inline def apply(breakpoints: js.Array[BreakpointLocation]): Breakpoints = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
  
  extension [Self <: Breakpoints](x: Self) {
    
    inline def setBreakpoints(value: js.Array[BreakpointLocation]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: BreakpointLocation*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}
