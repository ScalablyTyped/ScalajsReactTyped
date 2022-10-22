package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.NullableTypeAnnotation
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `407`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[NullableTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[NullableTypeAnnotation, TState]] = js.undefined
}
object `407` {
  
  inline def apply[TState](): `407`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`407`[TState]]
  }
  
  extension [Self <: `407`[?], TState](x: Self & `407`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[NullableTypeAnnotation], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[NullableTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[NullableTypeAnnotation], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[NullableTypeAnnotation], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
