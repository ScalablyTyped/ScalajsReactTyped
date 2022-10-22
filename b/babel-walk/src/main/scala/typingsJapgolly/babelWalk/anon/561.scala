package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelWalk.babelWalkStrings.DeclareModuleExports
import typingsJapgolly.babelWalk.libMod.NodeType
import typingsJapgolly.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `561`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DeclareModuleExports, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DeclareModuleExports, TState]] = js.undefined
}
object `561` {
  
  inline def apply[TState](): `561`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`561`[TState]]
  }
  
  extension [Self <: `561`[?], TState](x: Self & `561`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DeclareModuleExports], TState) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: /* node */ NodeType[DeclareModuleExports], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DeclareModuleExports], TState) => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: /* node */ NodeType[DeclareModuleExports], t1: TState) => (value(t0, t1)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
