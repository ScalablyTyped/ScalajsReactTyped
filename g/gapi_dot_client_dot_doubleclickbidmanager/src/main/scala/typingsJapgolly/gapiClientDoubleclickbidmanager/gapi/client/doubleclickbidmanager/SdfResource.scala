package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: AnonAlt): Request_[DownloadResponse]
}

object SdfResource {
  @scala.inline
  def apply(download: AnonAlt => CallbackTo[Request_[DownloadResponse]]): SdfResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("download")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt) => download(t0).runNow()))
    __obj.asInstanceOf[SdfResource]
  }
}

