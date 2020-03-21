package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var directives: js.UndefOr[js.Any] = js.undefined
  var outputSpeech: js.UndefOr[OutputSpeech] = js.undefined
  var reprompt: js.UndefOr[Reprompt] = js.undefined
  var shouldEndSession: js.UndefOr[Boolean] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    card: Card = null,
    directives: js.Any = null,
    outputSpeech: OutputSpeech = null,
    reprompt: Reprompt = null,
    shouldEndSession: js.UndefOr[Boolean] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (outputSpeech != null) __obj.updateDynamic("outputSpeech")(outputSpeech.asInstanceOf[js.Any])
    if (reprompt != null) __obj.updateDynamic("reprompt")(reprompt.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldEndSession)) __obj.updateDynamic("shouldEndSession")(shouldEndSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

