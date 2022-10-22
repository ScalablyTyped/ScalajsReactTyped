package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ReturnStatement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ReturnStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ReturnStatement, TState]] = js.undefined
}
object `301` {
  
  inline def apply[TState](): `301`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`301`[TState]]
  }
  
  extension [Self <: `301`[?], TState](x: Self & `301`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ReturnStatement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ReturnStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ReturnStatement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ReturnStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
