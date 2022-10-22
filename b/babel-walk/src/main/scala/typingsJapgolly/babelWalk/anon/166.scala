package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.V8IntrinsicIdentifier
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[V8IntrinsicIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[V8IntrinsicIdentifier, TState]] = js.undefined
}
object `166` {
  
  inline def apply[TState](): `166`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`166`[TState]]
  }
  
  extension [Self <: `166`[?], TState](x: Self & `166`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[V8IntrinsicIdentifier], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[V8IntrinsicIdentifier], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[V8IntrinsicIdentifier], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[V8IntrinsicIdentifier], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
