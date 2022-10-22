package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyPhrasesDetectionJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendMod.JobId
}
object DescribeKeyPhrasesDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribeKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
  }
  
  extension [Self <: DescribeKeyPhrasesDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
