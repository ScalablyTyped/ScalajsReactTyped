package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPhrasesDetectionJobFilter extends StObject {
  
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobName] = js.undefined
  
  /**
    * Filters the list of jobs based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.undefined
}
object KeyPhrasesDetectionJobFilter {
  
  inline def apply(): KeyPhrasesDetectionJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrasesDetectionJobFilter]
  }
  
  extension [Self <: KeyPhrasesDetectionJobFilter](x: Self) {
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setSubmitTimeAfter(value: js.Date): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    inline def setSubmitTimeBefore(value: js.Date): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
