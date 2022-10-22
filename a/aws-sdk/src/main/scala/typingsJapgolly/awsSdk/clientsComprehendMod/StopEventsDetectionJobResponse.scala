package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEventsDetectionJobResponse extends StObject {
  
  /**
    * The identifier of the events detection job to stop.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The status of the events detection job.
    */
  var JobStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
}
object StopEventsDetectionJobResponse {
  
  inline def apply(): StopEventsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEventsDetectionJobResponse]
  }
  
  extension [Self <: StopEventsDetectionJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
