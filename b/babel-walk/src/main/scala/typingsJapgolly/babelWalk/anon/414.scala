package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSInferType
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `414`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInferType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInferType, TState]] = js.undefined
}
object `414` {
  
  inline def apply[TState](): `414`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`414`[TState]]
  }
  
  extension [Self <: `414`[?], TState](x: Self & `414`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInferType], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSInferType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInferType], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSInferType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
