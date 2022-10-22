package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.VoidTypeAnnotation
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `418`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[VoidTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[VoidTypeAnnotation, TState]] = js.undefined
}
object `418` {
  
  inline def apply[TState](): `418`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`418`[TState]]
  }
  
  extension [Self <: `418`[?], TState](x: Self & `418`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[VoidTypeAnnotation], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[VoidTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[VoidTypeAnnotation], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[VoidTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
