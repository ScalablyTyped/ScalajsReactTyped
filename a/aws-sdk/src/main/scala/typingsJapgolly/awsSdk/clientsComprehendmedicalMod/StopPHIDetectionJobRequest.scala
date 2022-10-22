package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPHIDetectionJobRequest extends StObject {
  
  /**
    * The identifier of the PHI detection job to stop.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.JobId
}
object StopPHIDetectionJobRequest {
  
  inline def apply(JobId: JobId): StopPHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPHIDetectionJobRequest]
  }
  
  extension [Self <: StopPHIDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
