package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.JSXElement
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `501`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.undefined
}
object `501` {
  
  inline def apply[TState](): `501`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`501`[TState]]
  }
  
  extension [Self <: `501`[?], TState](x: Self & `501`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXElement], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[JSXElement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXElement], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[JSXElement], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
