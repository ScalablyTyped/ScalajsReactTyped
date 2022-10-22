package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.JSXSpreadChild
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXSpreadChild, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[JSXSpreadChild, TState]] = js.undefined
}
object `82` {
  
  inline def apply[TState](): `82`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`82`[TState]]
  }
  
  extension [Self <: `82`[?], TState](x: Self & `82`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXSpreadChild], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[JSXSpreadChild], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXSpreadChild], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[JSXSpreadChild], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
