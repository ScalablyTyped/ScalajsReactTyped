package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchRequestEntry]] = js.undefined
}

object ShippingsettingsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[ShippingsettingsCustomBatchRequestEntry] = null): ShippingsettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingsettingsCustomBatchRequest]
  }
}

