package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesListResponse extends js.Object {
  var creativeFieldValues: js.UndefOr[js.Array[CreativeFieldValue]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CreativeFieldValuesListResponse {
  @scala.inline
  def apply(
    creativeFieldValues: js.Array[CreativeFieldValue] = null,
    kind: String = null,
    nextPageToken: String = null
  ): CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldValues != null) __obj.updateDynamic("creativeFieldValues")(creativeFieldValues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeFieldValuesListResponse]
  }
}

