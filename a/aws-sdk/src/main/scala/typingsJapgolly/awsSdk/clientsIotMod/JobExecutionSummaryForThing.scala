package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionSummaryForThing extends StObject {
  
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}
object JobExecutionSummaryForThing {
  
  inline def apply(): JobExecutionSummaryForThing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForThing]
  }
  
  extension [Self <: JobExecutionSummaryForThing](x: Self) {
    
    inline def setJobExecutionSummary(value: JobExecutionSummary): Self = StObject.set(x, "jobExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionSummaryUndefined: Self = StObject.set(x, "jobExecutionSummary", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
