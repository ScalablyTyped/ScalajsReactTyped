package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSTypeOperator
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `356`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeOperator, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeOperator, TState]] = js.undefined
}
object `356` {
  
  inline def apply[TState](): `356`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`356`[TState]]
  }
  
  extension [Self <: `356`[?], TState](x: Self & `356`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeOperator], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSTypeOperator], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeOperator], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSTypeOperator], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
