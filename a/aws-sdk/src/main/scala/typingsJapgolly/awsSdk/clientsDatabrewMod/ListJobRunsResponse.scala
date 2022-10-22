package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobRunsResponse extends StObject {
  
  /**
    * A list of job runs that have occurred for the specified job.
    */
  var JobRuns: JobRunList
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.NextToken] = js.undefined
}
object ListJobRunsResponse {
  
  inline def apply(JobRuns: JobRunList): ListJobRunsResponse = {
    val __obj = js.Dynamic.literal(JobRuns = JobRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobRunsResponse]
  }
  
  extension [Self <: ListJobRunsResponse](x: Self) {
    
    inline def setJobRuns(value: JobRunList): Self = StObject.set(x, "JobRuns", value.asInstanceOf[js.Any])
    
    inline def setJobRunsVarargs(value: JobRun*): Self = StObject.set(x, "JobRuns", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
