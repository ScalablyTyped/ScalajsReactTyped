package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSDeclareMethod
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `383`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSDeclareMethod, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSDeclareMethod, TState]] = js.undefined
}
object `383` {
  
  inline def apply[TState](): `383`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`383`[TState]]
  }
  
  extension [Self <: `383`[?], TState](x: Self & `383`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSDeclareMethod], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSDeclareMethod], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSDeclareMethod], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSDeclareMethod], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
