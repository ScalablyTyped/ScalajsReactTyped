package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the sentiment detection job to stop.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendMod.JobId
}
object StopSentimentDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSentimentDetectionJobRequest]
  }
  
  extension [Self <: StopSentimentDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
