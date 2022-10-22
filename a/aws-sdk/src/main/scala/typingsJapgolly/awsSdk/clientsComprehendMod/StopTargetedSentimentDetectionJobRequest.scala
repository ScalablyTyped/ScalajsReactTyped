package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTargetedSentimentDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the targeted sentiment detection job to stop.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendMod.JobId
}
object StopTargetedSentimentDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopTargetedSentimentDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTargetedSentimentDetectionJobRequest]
  }
  
  extension [Self <: StopTargetedSentimentDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
