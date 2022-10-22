package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.UserWhitespacable
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[UserWhitespacable, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[UserWhitespacable, TState]] = js.undefined
}
object `35` {
  
  inline def apply[TState](): `35`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`35`[TState]]
  }
  
  extension [Self <: `35`[?], TState](x: Self & `35`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[UserWhitespacable], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[UserWhitespacable], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[UserWhitespacable], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[UserWhitespacable], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
