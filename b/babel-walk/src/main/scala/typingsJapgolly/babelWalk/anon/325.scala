package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.RestElement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `325`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[RestElement, TState]] = js.undefined
}
object `325` {
  
  inline def apply[TState](): `325`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`325`[TState]]
  }
  
  extension [Self <: `325`[?], TState](x: Self & `325`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[RestElement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[RestElement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[RestElement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[RestElement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
