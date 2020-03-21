package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLanguagesResource extends js.Object {
  /** Returns a list of application languages that the YouTube website supports. */
  def list(request: AnonUserIp): Request_[I18nLanguageListResponse]
}

object I18nLanguagesResource {
  @scala.inline
  def apply(list: AnonUserIp => CallbackTo[Request_[I18nLanguageListResponse]]): I18nLanguagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonUserIp) => list(t0).runNow()))
    __obj.asInstanceOf[I18nLanguagesResource]
  }
}

