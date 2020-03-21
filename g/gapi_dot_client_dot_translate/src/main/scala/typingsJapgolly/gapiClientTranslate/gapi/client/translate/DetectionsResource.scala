package typingsJapgolly.gapiClientTranslate.gapi.client.translate

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTranslate.AnonBearertoken
import typingsJapgolly.gapiClientTranslate.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: AnonBearertoken): Request_[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: AnonCallback): Request_[DetectionsListResponse]
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: AnonBearertoken => CallbackTo[Request_[DetectionsListResponse]],
    list: AnonCallback => CallbackTo[Request_[DetectionsListResponse]]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detect")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTranslate.AnonBearertoken) => detect(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTranslate.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[DetectionsResource]
  }
}

