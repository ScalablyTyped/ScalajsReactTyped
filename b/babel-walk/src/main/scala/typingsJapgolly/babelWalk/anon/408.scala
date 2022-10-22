package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.Identifier
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `408`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[Identifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[Identifier, TState]] = js.undefined
}
object `408` {
  
  inline def apply[TState](): `408`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`408`[TState]]
  }
  
  extension [Self <: `408`[?], TState](x: Self & `408`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[Identifier], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[Identifier], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[Identifier], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[Identifier], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
