package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.EnumMember
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[EnumMember, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[EnumMember, TState]] = js.undefined
}
object `18` {
  
  inline def apply[TState](): `18`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[TState]]
  }
  
  extension [Self <: `18`[?], TState](x: Self & `18`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumMember], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[EnumMember], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumMember], TState, /* ancestors */ js.Array[Node]) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[EnumMember], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
