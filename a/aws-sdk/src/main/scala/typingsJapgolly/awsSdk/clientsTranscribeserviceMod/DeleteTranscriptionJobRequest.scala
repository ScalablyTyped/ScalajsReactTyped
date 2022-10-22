package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTranscriptionJobRequest extends StObject {
  
  /**
    * The name of the transcription job you want to delete. Job names are case sensitive.
    */
  var TranscriptionJobName: typingsJapgolly.awsSdk.clientsTranscribeserviceMod.TranscriptionJobName
}
object DeleteTranscriptionJobRequest {
  
  inline def apply(TranscriptionJobName: TranscriptionJobName): DeleteTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTranscriptionJobRequest]
  }
  
  extension [Self <: DeleteTranscriptionJobRequest](x: Self) {
    
    inline def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
