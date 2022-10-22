package typingsJapgolly.babelWalk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTypes.mod.Node
import typingsJapgolly.babelWalk.babelWalkStrings.PipelinePrimaryTopicReference
import typingsJapgolly.babelWalk.libMod.AncestorFunction
import typingsJapgolly.babelWalk.libMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[PipelinePrimaryTopicReference, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[PipelinePrimaryTopicReference, TState]] = js.undefined
}
object `36` {
  
  inline def apply[TState](): `36`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`[TState]]
  }
  
  extension [Self <: `36`[?], TState](x: Self & `36`[TState]) {
    
    inline def setEnter(
      value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "enter", js.Any.fromFunction3((t0: /* node */ NodeType[PipelinePrimaryTopicReference], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(
      value: (/* node */ NodeType[PipelinePrimaryTopicReference], TState, /* ancestors */ js.Array[Node]) => Callback
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3((t0: /* node */ NodeType[PipelinePrimaryTopicReference], t1: TState, t2: /* ancestors */ js.Array[Node]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
