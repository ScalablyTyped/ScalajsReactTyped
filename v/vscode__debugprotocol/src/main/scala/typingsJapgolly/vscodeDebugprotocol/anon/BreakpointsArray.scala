package typingsJapgolly.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsArray extends StObject {
  
  /** Information about the breakpoints. The array elements correspond to the elements of the `breakpoints` array. */
  var breakpoints: js.Array[typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]
}
object BreakpointsArray {
  
  inline def apply(breakpoints: js.Array[typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]): BreakpointsArray = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsArray]
  }
  
  extension [Self <: BreakpointsArray](x: Self) {
    
    inline def setBreakpoints(value: js.Array[typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}
