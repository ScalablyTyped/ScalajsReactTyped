package typingsJapgolly.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePhotoRequest extends js.Object {
  /**
    * Required. Photo object containing the
    * new metadata.
    */
  var photo: js.UndefOr[Photo] = js.undefined
  /**
    * Mask that identifies fields on the photo metadata to update.
    * If not present, the old Photo
    * metadata will be entirely replaced with the
    * new Photo metadata in this request.
    * The update fails if invalid fields are specified. Multiple fields can be
    * specified in a comma-delimited list.
    *
    * The following fields are valid:
    *
    * &#42; `pose.heading`
    * &#42; `pose.latLngPair`
    * &#42; `pose.pitch`
    * &#42; `pose.roll`
    * &#42; `pose.level`
    * &#42; `pose.altitude`
    * &#42; `connections`
    * &#42; `places`
    *
    *
    * <aside class="note"><b>Note:</b> Repeated fields in
    * updateMask
    * mean the entire set of repeated values will be replaced with the new
    * contents. For example, if
    * updateMask
    * contains `connections` and `UpdatePhotoRequest.photo.connections` is empty,
    * all connections will be removed.</aside>
    */
  var updateMask: js.UndefOr[String] = js.undefined
}

object UpdatePhotoRequest {
  @scala.inline
  def apply(photo: Photo = null, updateMask: String = null): UpdatePhotoRequest = {
    val __obj = js.Dynamic.literal()
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhotoRequest]
  }
}

