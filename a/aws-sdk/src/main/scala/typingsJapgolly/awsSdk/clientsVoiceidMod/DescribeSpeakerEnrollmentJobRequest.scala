package typingsJapgolly.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpeakerEnrollmentJobRequest extends StObject {
  
  /**
    * The identifier of the domain containing the speaker enrollment job.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the speaker enrollment job you are describing.
    */
  var JobId: typingsJapgolly.awsSdk.clientsVoiceidMod.JobId
}
object DescribeSpeakerEnrollmentJobRequest {
  
  inline def apply(DomainId: DomainId, JobId: JobId): DescribeSpeakerEnrollmentJobRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpeakerEnrollmentJobRequest]
  }
  
  extension [Self <: DescribeSpeakerEnrollmentJobRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
