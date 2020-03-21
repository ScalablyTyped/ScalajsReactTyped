package typingsJapgolly.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionResult extends js.Object {
  /**
    * &#42;Output-only&#42; May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`).
    * These alternatives are ordered in terms of accuracy, with the top (first)
    * alternative being the most probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SpeechRecognitionAlternative]] = js.undefined
}

object SpeechRecognitionResult {
  @scala.inline
  def apply(alternatives: js.Array[SpeechRecognitionAlternative] = null): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
}

