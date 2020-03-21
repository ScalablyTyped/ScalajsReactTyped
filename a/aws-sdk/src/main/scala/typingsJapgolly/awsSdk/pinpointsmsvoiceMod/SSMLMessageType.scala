package typingsJapgolly.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSMLMessageType extends js.Object {
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[String] = js.native
  /**
    * The SSML-formatted text to deliver to the recipient.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[String] = js.native
}

object SSMLMessageType {
  @scala.inline
  def apply(LanguageCode: String = null, Text: NonEmptyString = null, VoiceId: String = null): SSMLMessageType = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSMLMessageType]
  }
}

