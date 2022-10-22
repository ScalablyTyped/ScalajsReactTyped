package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSNeverKeyword
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `576`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSNeverKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSNeverKeyword, TState]] = js.undefined
}
object `576` {
  
  inline def apply[TState](): `576`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`576`[TState]]
  }
  
  extension [Self <: `576`[?], TState](x: Self & `576`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSNeverKeyword], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSNeverKeyword], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSNeverKeyword], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSNeverKeyword], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
