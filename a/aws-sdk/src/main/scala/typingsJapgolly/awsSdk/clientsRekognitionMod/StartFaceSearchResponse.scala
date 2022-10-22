package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFaceSearchResponse extends StObject {
  
  /**
    * The identifier for the search job. Use JobId to identify the job in a subsequent call to GetFaceSearch. 
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartFaceSearchResponse {
  
  inline def apply(): StartFaceSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFaceSearchResponse]
  }
  
  extension [Self <: StartFaceSearchResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
