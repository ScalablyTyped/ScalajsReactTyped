package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowTasksResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the tasks in the maintenance window.
    */
  var Tasks: js.UndefOr[MaintenanceWindowTaskList] = js.undefined
}
object DescribeMaintenanceWindowTasksResult {
  
  inline def apply(): DescribeMaintenanceWindowTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksResult]
  }
  
  extension [Self <: DescribeMaintenanceWindowTasksResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTasks(value: MaintenanceWindowTaskList): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
    
    inline def setTasksVarargs(value: MaintenanceWindowTask*): Self = StObject.set(x, "Tasks", js.Array(value*))
  }
}
