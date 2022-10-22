package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSInstantiationExpression
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `554`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInstantiationExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInstantiationExpression, TState]] = js.undefined
}
object `554` {
  
  inline def apply[TState](): `554`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`554`[TState]]
  }
  
  extension [Self <: `554`[?], TState](x: Self & `554`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInstantiationExpression], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSInstantiationExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInstantiationExpression], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSInstantiationExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
