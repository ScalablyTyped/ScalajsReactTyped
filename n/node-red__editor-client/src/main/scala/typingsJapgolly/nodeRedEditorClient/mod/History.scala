package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  def clear(): Unit
  
  def depth(): Double
  
  def list(): js.Array[HistoryEvent]
  
  def listRedo(): js.Array[HistoryEvent]
  
  def markAllDirty(): Unit
  
  def peek(): HistoryEvent
  
  def pop(): Unit
  
  def push(ev: HistoryEvent): Unit
  
  def redo(): Unit
}
object History {
  
  inline def apply(
    clear: Callback,
    depth: CallbackTo[Double],
    list: CallbackTo[js.Array[HistoryEvent]],
    listRedo: CallbackTo[js.Array[HistoryEvent]],
    markAllDirty: Callback,
    peek: CallbackTo[HistoryEvent],
    pop: Callback,
    push: HistoryEvent => Callback,
    redo: Callback
  ): History = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, depth = depth.toJsFn, list = list.toJsFn, listRedo = listRedo.toJsFn, markAllDirty = markAllDirty.toJsFn, peek = peek.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1((t0: HistoryEvent) => push(t0).runNow()), redo = redo.toJsFn)
    __obj.asInstanceOf[History]
  }
  
  extension [Self <: History](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDepth(value: CallbackTo[Double]): Self = StObject.set(x, "depth", value.toJsFn)
    
    inline def setList(value: CallbackTo[js.Array[HistoryEvent]]): Self = StObject.set(x, "list", value.toJsFn)
    
    inline def setListRedo(value: CallbackTo[js.Array[HistoryEvent]]): Self = StObject.set(x, "listRedo", value.toJsFn)
    
    inline def setMarkAllDirty(value: Callback): Self = StObject.set(x, "markAllDirty", value.toJsFn)
    
    inline def setPeek(value: CallbackTo[HistoryEvent]): Self = StObject.set(x, "peek", value.toJsFn)
    
    inline def setPop(value: Callback): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPush(value: HistoryEvent => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: HistoryEvent) => value(t0).runNow()))
    
    inline def setRedo(value: Callback): Self = StObject.set(x, "redo", value.toJsFn)
  }
}
