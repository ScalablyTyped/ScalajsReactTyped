package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentResource extends js.Object {
  /**
    * De-identifies potentially sensitive info from a list of strings.
    * This method has limits on input size and output size.
    */
  def deidentify(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1DeidentifyContentResponse]
  /**
    * Finds potentially sensitive info in a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def inspect(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1InspectContentResponse]
  /**
    * Redacts potentially sensitive info from a list of strings.
    * This method has limits on input size, processing time, and output size.
    */
  def redact(request: AnonAccesstoken): Request_[GooglePrivacyDlpV2beta1RedactContentResponse]
}

object ContentResource {
  @scala.inline
  def apply(
    deidentify: AnonAccesstoken => CallbackTo[Request_[GooglePrivacyDlpV2beta1DeidentifyContentResponse]],
    inspect: AnonAccesstoken => CallbackTo[Request_[GooglePrivacyDlpV2beta1InspectContentResponse]],
    redact: AnonAccesstoken => CallbackTo[Request_[GooglePrivacyDlpV2beta1RedactContentResponse]]
  ): ContentResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deidentify")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAccesstoken) => deidentify(t0).runNow()))
    __obj.updateDynamic("inspect")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAccesstoken) => inspect(t0).runNow()))
    __obj.updateDynamic("redact")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonAccesstoken) => redact(t0).runNow()))
    __obj.asInstanceOf[ContentResource]
  }
}

