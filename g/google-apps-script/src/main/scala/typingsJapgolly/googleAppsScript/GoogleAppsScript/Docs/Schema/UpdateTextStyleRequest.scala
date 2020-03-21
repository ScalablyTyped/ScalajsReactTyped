package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTextStyleRequest extends js.Object {
  var fields: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object UpdateTextStyleRequest {
  @scala.inline
  def apply(fields: String = null, range: Range = null, textStyle: TextStyle = null): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
}

