package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataRepositoryTasksResponse extends StObject {
  
  /**
    * The collection of data repository task descriptions returned.
    */
  var DataRepositoryTasks: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.DataRepositoryTasks] = js.undefined
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeDataRepositoryTasksResponse {
  
  inline def apply(): DescribeDataRepositoryTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
  }
  
  extension [Self <: DescribeDataRepositoryTasksResponse](x: Self) {
    
    inline def setDataRepositoryTasks(value: DataRepositoryTasks): Self = StObject.set(x, "DataRepositoryTasks", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryTasksUndefined: Self = StObject.set(x, "DataRepositoryTasks", js.undefined)
    
    inline def setDataRepositoryTasksVarargs(value: DataRepositoryTask*): Self = StObject.set(x, "DataRepositoryTasks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
