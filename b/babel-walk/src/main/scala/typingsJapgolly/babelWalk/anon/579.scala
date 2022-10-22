package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.EnumNumberBody
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `579`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumNumberBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumNumberBody, TState]] = js.undefined
}
object `579` {
  
  inline def apply[TState](): `579`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`579`[TState]]
  }
  
  extension [Self <: `579`[?], TState](x: Self & `579`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[EnumNumberBody], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[EnumNumberBody], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[EnumNumberBody], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[EnumNumberBody], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
