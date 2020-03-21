package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: AnonAlt): Request_[DownloadLineItemsResponse]
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: AnonAlt): Request_[UploadLineItemsResponse]
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: AnonAlt => CallbackTo[Request_[DownloadLineItemsResponse]],
    uploadlineitems: AnonAlt => CallbackTo[Request_[UploadLineItemsResponse]]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downloadlineitems")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt) => downloadlineitems(t0).runNow()))
    __obj.updateDynamic("uploadlineitems")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclickbidmanager.AnonAlt) => uploadlineitems(t0).runNow()))
    __obj.asInstanceOf[LineitemsResource]
  }
}

