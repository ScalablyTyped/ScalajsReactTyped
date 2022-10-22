package typingsJapgolly.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubMod.ProgressPercent] = js.undefined
  
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typingsJapgolly.awsSdk.clientsMigrationhubMod.Status
  
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubMod.StatusDetail] = js.undefined
}
object Task {
  
  inline def apply(Status: Status): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
  }
}
