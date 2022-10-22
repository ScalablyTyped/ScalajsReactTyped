package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobManifestRequest extends StObject {
  
  /**
    * The ID for a job that you want to get the manifest file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsJapgolly.awsSdk.clientsSnowballMod.JobId
}
object GetJobManifestRequest {
  
  inline def apply(JobId: JobId): GetJobManifestRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobManifestRequest]
  }
  
  extension [Self <: GetJobManifestRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
