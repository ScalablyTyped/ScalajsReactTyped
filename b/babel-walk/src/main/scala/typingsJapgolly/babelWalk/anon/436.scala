package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ImportAttribute
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `436`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
}
object `436` {
  
  inline def apply[TState](): `436`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`436`[TState]]
  }
  
  extension [Self <: `436`[?], TState](x: Self & `436`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ImportAttribute], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ImportAttribute], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ImportAttribute], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ImportAttribute], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
