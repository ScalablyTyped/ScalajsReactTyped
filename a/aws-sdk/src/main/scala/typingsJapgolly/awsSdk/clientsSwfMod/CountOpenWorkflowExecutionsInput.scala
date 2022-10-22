package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountOpenWorkflowExecutionsInput extends StObject {
  
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName
  
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
  
  /**
    * Specifies the start time criteria that workflow executions must meet in order to be counted.
    */
  var startTimeFilter: ExecutionTimeFilter
  
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.undefined
  
  /**
    * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
}
object CountOpenWorkflowExecutionsInput {
  
  inline def apply(domain: DomainName, startTimeFilter: ExecutionTimeFilter): CountOpenWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], startTimeFilter = startTimeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
  }
  
  extension [Self <: CountOpenWorkflowExecutionsInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExecutionFilter(value: WorkflowExecutionFilter): Self = StObject.set(x, "executionFilter", value.asInstanceOf[js.Any])
    
    inline def setExecutionFilterUndefined: Self = StObject.set(x, "executionFilter", js.undefined)
    
    inline def setStartTimeFilter(value: ExecutionTimeFilter): Self = StObject.set(x, "startTimeFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilter(value: TagFilter): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    
    inline def setTypeFilter(value: WorkflowTypeFilter): Self = StObject.set(x, "typeFilter", value.asInstanceOf[js.Any])
    
    inline def setTypeFilterUndefined: Self = StObject.set(x, "typeFilter", js.undefined)
  }
}
