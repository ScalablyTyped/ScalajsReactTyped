package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.ClassPrivateProperty
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `568`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassPrivateProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassPrivateProperty, TState]] = js.undefined
}
object `568` {
  
  inline def apply[TState](): `568`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`568`[TState]]
  }
  
  extension [Self <: `568`[?], TState](x: Self & `568`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ClassPrivateProperty], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[ClassPrivateProperty], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ClassPrivateProperty], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[ClassPrivateProperty], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
