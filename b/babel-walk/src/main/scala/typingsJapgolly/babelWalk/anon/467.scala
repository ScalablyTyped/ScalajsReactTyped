package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ObjectProperty
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `467`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectProperty, TState]] = js.undefined
}
object `467` {
  
  inline def apply[TState](): `467`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`467`[TState]]
  }
  
  extension [Self <: `467`[?], TState](x: Self & `467`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ObjectProperty], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ObjectProperty], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ObjectProperty], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ObjectProperty], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
