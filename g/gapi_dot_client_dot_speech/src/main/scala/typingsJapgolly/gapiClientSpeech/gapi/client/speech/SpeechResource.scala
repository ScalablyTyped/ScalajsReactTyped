package typingsJapgolly.gapiClientSpeech.gapi.client.speech

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSpeech.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechResource extends js.Object {
  /**
    * Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains
    * a `LongRunningRecognizeResponse` message.
    */
  def longrunningrecognize(request: AnonBearertoken): Request_[Operation]
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: AnonBearertoken): Request_[RecognizeResponse]
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: AnonBearertoken => CallbackTo[Request_[Operation]],
    recognize: AnonBearertoken => CallbackTo[Request_[RecognizeResponse]]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("longrunningrecognize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpeech.AnonBearertoken) => longrunningrecognize(t0).runNow()))
    __obj.updateDynamic("recognize")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSpeech.AnonBearertoken) => recognize(t0).runNow()))
    __obj.asInstanceOf[SpeechResource]
  }
}

