package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.TSVoidKeyword
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.undefined
}
object `66` {
  
  inline def apply[TState](): `66`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`66`[TState]]
  }
  
  extension [Self <: `66`[?], TState](x: Self & `66`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[TSVoidKeyword], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[TSVoidKeyword], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
