package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePHIDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Comprehend Medical; generated for the job. The StartPHIDetectionJob operation returns this identifier in its response.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.JobId
}
object DescribePHIDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribePHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePHIDetectionJobRequest]
  }
  
  extension [Self <: DescribePHIDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
