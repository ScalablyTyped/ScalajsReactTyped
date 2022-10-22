package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobBookmarkRequest extends StObject {
  
  /**
    * The name of the job in question.
    */
  var JobName: typingsJapgolly.awsSdk.clientsGlueMod.JobName
  
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.RunId] = js.undefined
}
object GetJobBookmarkRequest {
  
  inline def apply(JobName: JobName): GetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobBookmarkRequest]
  }
  
  extension [Self <: GetJobBookmarkRequest](x: Self) {
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: RunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
