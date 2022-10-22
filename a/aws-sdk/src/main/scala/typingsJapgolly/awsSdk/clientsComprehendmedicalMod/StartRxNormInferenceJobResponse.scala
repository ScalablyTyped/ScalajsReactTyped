package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRxNormInferenceJobResponse extends StObject {
  
  /**
    * The identifier of the job.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StartRxNormInferenceJobResponse {
  
  inline def apply(): StartRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRxNormInferenceJobResponse]
  }
  
  extension [Self <: StartRxNormInferenceJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
