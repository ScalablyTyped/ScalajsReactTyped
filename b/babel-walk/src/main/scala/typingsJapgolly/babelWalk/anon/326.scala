package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.While
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `326`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[While, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[While, TState]] = js.undefined
}
object `326` {
  
  inline def apply[TState](): `326`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`326`[TState]]
  }
  
  extension [Self <: `326`[?], TState](x: Self & `326`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[While], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[While], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[While], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[While], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
