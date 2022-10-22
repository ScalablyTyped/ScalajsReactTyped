package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSOptionalType
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `517`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSOptionalType, TState]] = js.undefined
}
object `517` {
  
  inline def apply[TState](): `517`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`517`[TState]]
  }
  
  extension [Self <: `517`[?], TState](x: Self & `517`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSOptionalType], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSOptionalType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSOptionalType], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSOptionalType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
