package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCelebrityRecognitionResponse extends StObject {
  
  /**
    * The identifier for the celebrity recognition analysis job. Use JobId to identify the job in a subsequent call to GetCelebrityRecognition.
    */
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartCelebrityRecognitionResponse {
  
  inline def apply(): StartCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCelebrityRecognitionResponse]
  }
  
  extension [Self <: StartCelebrityRecognitionResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
