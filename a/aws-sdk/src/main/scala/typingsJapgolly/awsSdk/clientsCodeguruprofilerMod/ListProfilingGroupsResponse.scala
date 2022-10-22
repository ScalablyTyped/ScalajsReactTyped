package typingsJapgolly.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilingGroupsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListProfilingGroups request. When the results of a ListProfilingGroups request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  A returned list of profiling group names. A list of the names is returned only if includeDescription is false, otherwise a list of  ProfilingGroupDescription  objects is returned. 
    */
  var profilingGroupNames: ProfilingGroupNames
  
  /**
    *  A returned list  ProfilingGroupDescription  objects. A list of  ProfilingGroupDescription  objects is returned only if includeDescription is true, otherwise a list of profiling group names is returned. 
    */
  var profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.undefined
}
object ListProfilingGroupsResponse {
  
  inline def apply(profilingGroupNames: ProfilingGroupNames): ListProfilingGroupsResponse = {
    val __obj = js.Dynamic.literal(profilingGroupNames = profilingGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsResponse]
  }
  
  extension [Self <: ListProfilingGroupsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProfilingGroupNames(value: ProfilingGroupNames): Self = StObject.set(x, "profilingGroupNames", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupNamesVarargs(value: ProfilingGroupName*): Self = StObject.set(x, "profilingGroupNames", js.Array(value*))
    
    inline def setProfilingGroups(value: ProfilingGroupDescriptions): Self = StObject.set(x, "profilingGroups", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupsUndefined: Self = StObject.set(x, "profilingGroups", js.undefined)
    
    inline def setProfilingGroupsVarargs(value: ProfilingGroupDescription*): Self = StObject.set(x, "profilingGroups", js.Array(value*))
  }
}
