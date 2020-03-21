package typingsJapgolly.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoResponse extends js.Object {
  /**
    * The Photo resource, if the request
    * was successful.
    */
  var photo: js.UndefOr[Photo] = js.undefined
  /**
    * The status for the operation to get or update a single photo in the batch
    * request.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object PhotoResponse {
  @scala.inline
  def apply(photo: Photo = null, status: Status = null): PhotoResponse = {
    val __obj = js.Dynamic.literal()
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoResponse]
  }
}

