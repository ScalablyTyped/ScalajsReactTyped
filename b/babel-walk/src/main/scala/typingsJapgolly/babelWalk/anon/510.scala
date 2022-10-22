package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TypeAlias
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `510`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TypeAlias, TState]] = js.undefined
}
object `510` {
  
  inline def apply[TState](): `510`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`510`[TState]]
  }
  
  extension [Self <: `510`[?], TState](x: Self & `510`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TypeAlias], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TypeAlias], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TypeAlias], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TypeAlias], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
