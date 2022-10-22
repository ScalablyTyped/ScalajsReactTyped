package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.ClassPrivateProperty
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `271`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ClassPrivateProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ClassPrivateProperty, TState]] = js.undefined
}
object `271` {
  
  inline def apply[TState](): `271`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`271`[TState]]
  }
  
  extension [Self <: `271`[?], TState](x: Self & `271`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[ClassPrivateProperty], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[ClassPrivateProperty], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[ClassPrivateProperty], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[ClassPrivateProperty], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
