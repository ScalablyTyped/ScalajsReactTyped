package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.JSXSpreadAttribute
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[JSXSpreadAttribute, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[JSXSpreadAttribute, TState]] = js.undefined
}
object `56` {
  
  inline def apply[TState](): `56`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`[TState]]
  }
  
  extension [Self <: `56`[?], TState](x: Self & `56`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[JSXSpreadAttribute], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[JSXSpreadAttribute], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[JSXSpreadAttribute], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[JSXSpreadAttribute], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
