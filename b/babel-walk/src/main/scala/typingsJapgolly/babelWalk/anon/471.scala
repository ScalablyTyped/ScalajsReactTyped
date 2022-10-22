package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ModuleExpression
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `471`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ModuleExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ModuleExpression, TState]] = js.undefined
}
object `471` {
  
  inline def apply[TState](): `471`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`471`[TState]]
  }
  
  extension [Self <: `471`[?], TState](x: Self & `471`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ModuleExpression], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ModuleExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ModuleExpression], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ModuleExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
