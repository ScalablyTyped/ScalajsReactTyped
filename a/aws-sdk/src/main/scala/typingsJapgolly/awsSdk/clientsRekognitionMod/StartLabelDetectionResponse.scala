package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLabelDetectionResponse extends StObject {
  
  /**
    * The identifier for the label detection job. Use JobId to identify the job in a subsequent call to GetLabelDetection. 
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartLabelDetectionResponse {
  
  inline def apply(): StartLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartLabelDetectionResponse]
  }
  
  extension [Self <: StartLabelDetectionResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
