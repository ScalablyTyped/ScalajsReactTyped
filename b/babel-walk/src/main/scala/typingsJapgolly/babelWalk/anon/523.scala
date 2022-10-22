package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.Statement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `523`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Statement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Statement, TState]] = js.undefined
}
object `523` {
  
  inline def apply[TState](): `523`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`523`[TState]]
  }
  
  extension [Self <: `523`[?], TState](x: Self & `523`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Statement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[Statement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Statement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[Statement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
