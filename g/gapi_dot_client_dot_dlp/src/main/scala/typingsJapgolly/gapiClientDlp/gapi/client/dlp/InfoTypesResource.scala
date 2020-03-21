package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoTypesResource extends js.Object {
  /** Returns sensitive information types for given category. */
  def list(request: AnonCallback): Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
}

object InfoTypesResource {
  @scala.inline
  def apply(list: AnonCallback => CallbackTo[Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]]): InfoTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[InfoTypesResource]
  }
}

