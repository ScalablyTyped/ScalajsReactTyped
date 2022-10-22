package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.IfStatement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `393`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[IfStatement, TState]] = js.undefined
}
object `393` {
  
  inline def apply[TState](): `393`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`393`[TState]]
  }
  
  extension [Self <: `393`[?], TState](x: Self & `393`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[IfStatement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[IfStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[IfStatement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[IfStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
