package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ArrayExpression
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `360`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ArrayExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ArrayExpression, TState]] = js.undefined
}
object `360` {
  
  inline def apply[TState](): `360`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`360`[TState]]
  }
  
  extension [Self <: `360`[?], TState](x: Self & `360`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ArrayExpression], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ArrayExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ArrayExpression], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ArrayExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
