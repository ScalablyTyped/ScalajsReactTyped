package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmbeddedObjectPositionResponse extends js.Object {
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
}

object UpdateEmbeddedObjectPositionResponse {
  @scala.inline
  def apply(position: EmbeddedObjectPosition = null): UpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmbeddedObjectPositionResponse]
  }
}

