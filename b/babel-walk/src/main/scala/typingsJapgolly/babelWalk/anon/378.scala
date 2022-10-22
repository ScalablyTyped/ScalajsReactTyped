package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TaggedTemplateExpression
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `378`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TaggedTemplateExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TaggedTemplateExpression, TState]] = js.undefined
}
object `378` {
  
  inline def apply[TState](): `378`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`378`[TState]]
  }
  
  extension [Self <: `378`[?], TState](x: Self & `378`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TaggedTemplateExpression], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TaggedTemplateExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TaggedTemplateExpression], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TaggedTemplateExpression], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
