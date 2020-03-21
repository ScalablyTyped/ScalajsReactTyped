package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadLineItemsResponse extends js.Object {
  /** Retrieved line items in CSV format. For more information about file formats, see  Entity Write File Format. */
  var lineItems: js.UndefOr[String] = js.undefined
}

object DownloadLineItemsResponse {
  @scala.inline
  def apply(lineItems: String = null): DownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadLineItemsResponse]
  }
}

