package typingsJapgolly.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRef extends js.Object {
  /**
    * Required. An upload reference should be unique for each user. It follows
    * the form:
    * "https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}"
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
}

object UploadRef {
  @scala.inline
  def apply(uploadUrl: String = null): UploadRef = {
    val __obj = js.Dynamic.literal()
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRef]
  }
}

