package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.BreakStatement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `297`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BreakStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BreakStatement, TState]] = js.undefined
}
object `297` {
  
  inline def apply[TState](): `297`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`297`[TState]]
  }
  
  extension [Self <: `297`[?], TState](x: Self & `297`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BreakStatement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[BreakStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BreakStatement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[BreakStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
