package typingsJapgolly.mobxTask

import typingsJapgolly.mobxTask.libTaskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTaskGroupMod {
  
  /* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
  trait TaskGroup[A /* <: js.Array[Any] */, R] extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var `match`: js.UndefOr[Any] = js.undefined
    
    var pending: js.UndefOr[Any] = js.undefined
    
    var rejected: js.UndefOr[Any] = js.undefined
    
    var resolved: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object TaskGroup {
    
    @JSImport("mobx-task/lib/task-group", "TaskGroup")
    @js.native
    def apply[A /* <: js.Array[Any] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
    
    extension [Self <: TaskGroup[?, ?], A /* <: js.Array[Any] */, R](x: Self & (TaskGroup[A, R])) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMatch(value: Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setPending(value: Any): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setRejected(value: Any): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      inline def setResolved(value: Any): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobxTask.mobxTaskStrings.state
    - typingsJapgolly.mobxTask.mobxTaskStrings.pending
    - typingsJapgolly.mobxTask.mobxTaskStrings.resolved
    - typingsJapgolly.mobxTask.mobxTaskStrings.rejected
    - typingsJapgolly.mobxTask.mobxTaskStrings.result
    - typingsJapgolly.mobxTask.mobxTaskStrings.error
    - typingsJapgolly.mobxTask.mobxTaskStrings.`match`
  */
  trait QueryableMethods extends StObject
  object QueryableMethods {
    
    inline def error: typingsJapgolly.mobxTask.mobxTaskStrings.error = "error".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.error]
    
    inline def `match`: typingsJapgolly.mobxTask.mobxTaskStrings.`match` = "match".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.`match`]
    
    inline def pending: typingsJapgolly.mobxTask.mobxTaskStrings.pending = "pending".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.pending]
    
    inline def rejected: typingsJapgolly.mobxTask.mobxTaskStrings.rejected = "rejected".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.rejected]
    
    inline def resolved: typingsJapgolly.mobxTask.mobxTaskStrings.resolved = "resolved".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.resolved]
    
    inline def result: typingsJapgolly.mobxTask.mobxTaskStrings.result = "result".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.result]
    
    inline def state: typingsJapgolly.mobxTask.mobxTaskStrings.state = "state".asInstanceOf[typingsJapgolly.mobxTask.mobxTaskStrings.state]
  }
}
