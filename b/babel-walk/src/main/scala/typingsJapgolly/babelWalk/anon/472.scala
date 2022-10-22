package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSExpressionWithTypeArguments
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `472`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSExpressionWithTypeArguments, TState]] = js.undefined
}
object `472` {
  
  inline def apply[TState](): `472`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`472`[TState]]
  }
  
  extension [Self <: `472`[?], TState](x: Self & `472`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSExpressionWithTypeArguments], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSExpressionWithTypeArguments], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSExpressionWithTypeArguments], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
