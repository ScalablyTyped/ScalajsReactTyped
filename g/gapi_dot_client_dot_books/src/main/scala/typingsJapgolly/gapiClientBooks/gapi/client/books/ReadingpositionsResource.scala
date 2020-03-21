package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAction
import typingsJapgolly.gapiClientBooks.AnonAltContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingpositionsResource extends js.Object {
  /** Retrieves my reading position information for a volume. */
  def get(request: AnonAltContentVersion): Request_[ReadingPosition]
  /** Sets my reading position information for a volume. */
  def setPosition(request: AnonAction): Request_[Unit]
}

object ReadingpositionsResource {
  @scala.inline
  def apply(
    get: AnonAltContentVersion => CallbackTo[Request_[ReadingPosition]],
    setPosition: AnonAction => CallbackTo[Request_[Unit]]
  ): ReadingpositionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAltContentVersion) => get(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAction) => setPosition(t0).runNow()))
    __obj.asInstanceOf[ReadingpositionsResource]
  }
}

