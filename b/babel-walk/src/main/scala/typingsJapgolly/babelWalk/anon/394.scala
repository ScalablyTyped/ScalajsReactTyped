package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ArrayTypeAnnotation
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `394`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ArrayTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ArrayTypeAnnotation, TState]] = js.undefined
}
object `394` {
  
  inline def apply[TState](): `394`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`394`[TState]]
  }
  
  extension [Self <: `394`[?], TState](x: Self & `394`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ArrayTypeAnnotation], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ArrayTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ArrayTypeAnnotation], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ArrayTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
