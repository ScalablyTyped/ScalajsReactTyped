package typingsJapgolly.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTextTranslationJobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of a job, use this ID with the DescribeTextTranslationJob operation.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.JobId] = js.undefined
  
  /**
    * The status of the job. Possible values include:    SUBMITTED - The job has been received and is queued for processing.    IN_PROGRESS - Amazon Translate is processing the job.    COMPLETED - The job was successfully completed and the output is available.    COMPLETED_WITH_ERROR - The job was completed with errors. The errors can be analyzed in the job's output.    FAILED - The job did not complete. To get details, use the DescribeTextTranslationJob operation.    STOP_REQUESTED - The user who started the job has requested that it be stopped.    STOPPED - The job has been stopped.  
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.JobStatus] = js.undefined
}
object StartTextTranslationJobResponse {
  
  inline def apply(): StartTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextTranslationJobResponse]
  }
  
  extension [Self <: StartTextTranslationJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
