package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSThisType
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `546`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSThisType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSThisType, TState]] = js.undefined
}
object `546` {
  
  inline def apply[TState](): `546`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`546`[TState]]
  }
  
  extension [Self <: `546`[?], TState](x: Self & `546`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSThisType], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSThisType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSThisType], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSThisType], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
