package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SimpleResponse. */
trait ISimpleResponse extends js.Object {
  /** SimpleResponse displayText */
  var displayText: js.UndefOr[String | Null] = js.undefined
  /** SimpleResponse ssml */
  var ssml: js.UndefOr[String | Null] = js.undefined
  /** SimpleResponse textToSpeech */
  var textToSpeech: js.UndefOr[String | Null] = js.undefined
}

object ISimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): ISimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleResponse]
  }
}

