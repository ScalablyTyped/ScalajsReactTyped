package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.StringTypeAnnotation
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `298`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[StringTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[StringTypeAnnotation, TState]] = js.undefined
}
object `298` {
  
  inline def apply[TState](): `298`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`298`[TState]]
  }
  
  extension [Self <: `298`[?], TState](x: Self & `298`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[StringTypeAnnotation], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[StringTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[StringTypeAnnotation], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[StringTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
