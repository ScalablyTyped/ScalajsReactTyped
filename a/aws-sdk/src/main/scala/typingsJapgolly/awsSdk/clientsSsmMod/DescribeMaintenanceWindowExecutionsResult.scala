package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowExecutionsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about the maintenance window executions.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.undefined
}
object DescribeMaintenanceWindowExecutionsResult {
  
  inline def apply(): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
  
  extension [Self <: DescribeMaintenanceWindowExecutionsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWindowExecutions(value: MaintenanceWindowExecutionList): Self = StObject.set(x, "WindowExecutions", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionsUndefined: Self = StObject.set(x, "WindowExecutions", js.undefined)
    
    inline def setWindowExecutionsVarargs(value: MaintenanceWindowExecution*): Self = StObject.set(x, "WindowExecutions", js.Array(value*))
  }
}
