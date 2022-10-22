package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.OptionalMemberExpression
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `327`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[OptionalMemberExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[OptionalMemberExpression, TState]] = js.undefined
}
object `327` {
  
  inline def apply[TState](): `327`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`327`[TState]]
  }
  
  extension [Self <: `327`[?], TState](x: Self & `327`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[OptionalMemberExpression], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[OptionalMemberExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[OptionalMemberExpression], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[OptionalMemberExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
