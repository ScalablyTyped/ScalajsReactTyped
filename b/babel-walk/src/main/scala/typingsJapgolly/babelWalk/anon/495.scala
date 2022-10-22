package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.TSUndefinedKeyword
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `495`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSUndefinedKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSUndefinedKeyword, TState]] = js.undefined
}
object `495` {
  
  inline def apply[TState](): `495`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`495`[TState]]
  }
  
  extension [Self <: `495`[?], TState](x: Self & `495`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSUndefinedKeyword], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[TSUndefinedKeyword], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSUndefinedKeyword], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[TSUndefinedKeyword], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
