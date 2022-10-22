package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.DeclaredPredicate
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `520`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclaredPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclaredPredicate, TState]] = js.undefined
}
object `520` {
  
  inline def apply[TState](): `520`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`520`[TState]]
  }
  
  extension [Self <: `520`[?], TState](x: Self & `520`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclaredPredicate], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[DeclaredPredicate], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclaredPredicate], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[DeclaredPredicate], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
