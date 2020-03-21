package typingsJapgolly.gapiClientWebfonts.gapi.client.webfonts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientWebfonts.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebfontsResource extends js.Object {
  /** Retrieves the list of fonts currently served by the Google Fonts Developer API */
  def list(request: AnonAlt): Request_[WebfontList]
}

object WebfontsResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[WebfontList]]): WebfontsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientWebfonts.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[WebfontsResource]
  }
}

