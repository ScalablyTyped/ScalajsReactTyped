package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.VoidTypeAnnotation
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[VoidTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[VoidTypeAnnotation, TState]] = js.undefined
}
object `121` {
  
  inline def apply[TState](): `121`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`121`[TState]]
  }
  
  extension [Self <: `121`[?], TState](x: Self & `121`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[VoidTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[VoidTypeAnnotation], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[VoidTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[VoidTypeAnnotation], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
