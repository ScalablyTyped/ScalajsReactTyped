package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitiesDetectionV2JobRequest extends StObject {
  
  /**
    * The identifier that Comprehend Medical; generated for the job. The StartEntitiesDetectionV2Job operation returns this identifier in its response.
    */
  var JobId: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.JobId
}
object DescribeEntitiesDetectionV2JobRequest {
  
  inline def apply(JobId: JobId): DescribeEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntitiesDetectionV2JobRequest]
  }
  
  extension [Self <: DescribeEntitiesDetectionV2JobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
