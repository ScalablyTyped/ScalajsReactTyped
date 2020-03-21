package typingsJapgolly.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  /** URL of the form. */
  var formUrl: js.UndefOr[String] = js.undefined
  /**
    * URL of the form responses document.
    * Only set if respsonses have been recorded and only when the
    * requesting user is an editor of the form.
    *
    * Read-only.
    */
  var responseUrl: js.UndefOr[String] = js.undefined
  /**
    * URL of a thumbnail image of the Form.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  /**
    * Title of the Form.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Form {
  @scala.inline
  def apply(
    formUrl: String = null,
    responseUrl: String = null,
    thumbnailUrl: String = null,
    title: String = null
  ): Form = {
    val __obj = js.Dynamic.literal()
    if (formUrl != null) __obj.updateDynamic("formUrl")(formUrl.asInstanceOf[js.Any])
    if (responseUrl != null) __obj.updateDynamic("responseUrl")(responseUrl.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
}

