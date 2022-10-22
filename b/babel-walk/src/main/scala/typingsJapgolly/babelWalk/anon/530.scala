package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.JSXText
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `530`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXText, TState]] = js.undefined
}
object `530` {
  
  inline def apply[TState](): `530`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`530`[TState]]
  }
  
  extension [Self <: `530`[?], TState](x: Self & `530`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXText], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[JSXText], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXText], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[JSXText], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
