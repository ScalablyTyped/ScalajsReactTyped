package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowExecutionTasksRequest extends StObject {
  
  /**
    * Optional filters used to scope down the returned tasks. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * The ID of the maintenance window execution whose task executions should be retrieved.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}
object DescribeMaintenanceWindowExecutionTasksRequest {
  
  inline def apply(WindowExecutionId: MaintenanceWindowExecutionId): DescribeMaintenanceWindowExecutionTasksRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTasksRequest]
  }
  
  extension [Self <: DescribeMaintenanceWindowExecutionTasksRequest](x: Self) {
    
    inline def setFilters(value: MaintenanceWindowFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: MaintenanceWindowFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaintenanceWindowMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
