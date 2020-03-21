package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /** Retrieves a list of languages. */
  def list(request: AnonKey): Request_[LanguagesListResponse]
}

object LanguagesResource {
  @scala.inline
  def apply(list: AnonKey => CallbackTo[Request_[LanguagesListResponse]]): LanguagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[LanguagesResource]
  }
}

