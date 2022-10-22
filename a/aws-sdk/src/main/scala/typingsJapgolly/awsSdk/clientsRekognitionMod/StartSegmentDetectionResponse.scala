package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSegmentDetectionResponse extends StObject {
  
  /**
    * Unique identifier for the segment detection job. The JobId is returned from StartSegmentDetection. 
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartSegmentDetectionResponse {
  
  inline def apply(): StartSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionResponse]
  }
  
  extension [Self <: StartSegmentDetectionResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
