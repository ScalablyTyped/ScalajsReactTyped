package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.JSXNamespacedName
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `480`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXNamespacedName, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXNamespacedName, TState]] = js.undefined
}
object `480` {
  
  inline def apply[TState](): `480`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`480`[TState]]
  }
  
  extension [Self <: `480`[?], TState](x: Self & `480`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXNamespacedName], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[JSXNamespacedName], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXNamespacedName], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[JSXNamespacedName], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
