package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[LiasettingsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object LiasettingsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[LiasettingsCustomBatchResponseEntry] = null, kind: String = null): LiasettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiasettingsCustomBatchResponse]
  }
}

