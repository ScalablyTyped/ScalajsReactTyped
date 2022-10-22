package typingsJapgolly.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /** Information about the exception breakpoints or filters.
  				The breakpoints returned are in the same order as the elements of the `filters`, `filterOptions`, `exceptionOptions` arrays in the arguments. If both `filters` and `filterOptions` are given, the returned array must start with `filters` information first, followed by `filterOptions` information.
  			*/
  var breakpoints: js.UndefOr[js.Array[typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setBreakpoints(value: js.Array[typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}
