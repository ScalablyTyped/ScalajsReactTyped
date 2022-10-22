package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.Directive
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Directive, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Directive, TState]] = js.undefined
}
object `369` {
  
  inline def apply[TState](): `369`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`369`[TState]]
  }
  
  extension [Self <: `369`[?], TState](x: Self & `369`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Directive], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[Directive], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Directive], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[Directive], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
