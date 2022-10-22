package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.OptionalIndexedAccessType
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[OptionalIndexedAccessType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[OptionalIndexedAccessType, TState]] = js.undefined
}
object `172` {
  
  inline def apply[TState](): `172`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`172`[TState]]
  }
  
  extension [Self <: `172`[?], TState](x: Self & `172`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[OptionalIndexedAccessType], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[OptionalIndexedAccessType], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[OptionalIndexedAccessType], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[OptionalIndexedAccessType], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
