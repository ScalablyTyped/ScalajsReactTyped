package typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Resource
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechResource extends StObject {
  
  /**
    * Performs asynchronous speech recognition: receive results via the google.longrunning.Operations interface. Returns either an `Operation.error` or an `Operation.response` which
    * contains a `LongRunningRecognizeResponse` message. For more information on asynchronous speech recognition, see the
    * [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
    */
  def longrunningrecognize(request: QuotaUser): Request[Operation] = js.native
  def longrunningrecognize(request: UploadType, body: LongRunningRecognizeRequest): Request[Operation] = js.native
  
  /** Performs synchronous speech recognition: receive results after all audio has been sent and processed. */
  def recognize(request: Resource): Request[RecognizeResponse] = js.native
  def recognize(request: UploadType, body: RecognizeRequest): Request[RecognizeResponse] = js.native
}
