package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ThrowStatement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `462`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ThrowStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ThrowStatement, TState]] = js.undefined
}
object `462` {
  
  inline def apply[TState](): `462`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`462`[TState]]
  }
  
  extension [Self <: `462`[?], TState](x: Self & `462`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ThrowStatement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ThrowStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ThrowStatement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ThrowStatement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
