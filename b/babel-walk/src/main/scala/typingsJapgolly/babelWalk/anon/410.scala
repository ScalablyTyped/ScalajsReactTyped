package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.Terminatorless
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Terminatorless, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Terminatorless, TState]] = js.undefined
}
object `410` {
  
  inline def apply[TState](): `410`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`410`[TState]]
  }
  
  extension [Self <: `410`[?], TState](x: Self & `410`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Terminatorless], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[Terminatorless], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Terminatorless], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[Terminatorless], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
