package typingsJapgolly.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteControl extends js.Object {
  /**
    * The revision ID of the presentation required for the write request. If
    * specified and the `required_revision_id` doesn't exactly match the
    * presentation's current `revision_id`, the request will not be processed and
    * will return a 400 bad request error.
    */
  var requiredRevisionId: js.UndefOr[String] = js.undefined
}

object WriteControl {
  @scala.inline
  def apply(requiredRevisionId: String = null): WriteControl = {
    val __obj = js.Dynamic.literal()
    if (requiredRevisionId != null) __obj.updateDynamic("requiredRevisionId")(requiredRevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteControl]
  }
}

