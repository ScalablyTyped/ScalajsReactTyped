package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.FlowPredicate
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `435`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowPredicate, TState]] = js.undefined
}
object `435` {
  
  inline def apply[TState](): `435`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`435`[TState]]
  }
  
  extension [Self <: `435`[?], TState](x: Self & `435`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowPredicate], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[FlowPredicate], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowPredicate], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[FlowPredicate], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
