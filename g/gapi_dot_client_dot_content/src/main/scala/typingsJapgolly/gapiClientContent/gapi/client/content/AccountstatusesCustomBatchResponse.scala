package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountstatusesCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountstatusesCustomBatchResponseEntry] = null, kind: String = null): AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountstatusesCustomBatchResponse]
  }
}

