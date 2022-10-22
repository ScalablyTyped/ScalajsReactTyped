package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.BlockParent
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[BlockParent, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[BlockParent, TState]] = js.undefined
}
object `8` {
  
  inline def apply[TState](): `8`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[TState]]
  }
  
  extension [Self <: `8`[?], TState](x: Self & `8`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BlockParent], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[BlockParent], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BlockParent], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[BlockParent], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
