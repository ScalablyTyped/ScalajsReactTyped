package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchRequest extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchRequestEntry]] = js.undefined
}

object InappproductsBatchRequest {
  @scala.inline
  def apply(entrys: js.Array[InappproductsBatchRequestEntry] = null): InappproductsBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entrys != null) __obj.updateDynamic("entrys")(entrys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InappproductsBatchRequest]
  }
}

