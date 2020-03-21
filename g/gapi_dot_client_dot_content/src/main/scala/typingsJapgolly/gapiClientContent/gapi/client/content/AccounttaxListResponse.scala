package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The token for the retrieval of the next page of account tax settings. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[AccountTax]] = js.undefined
}

object AccounttaxListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, resources: js.Array[AccountTax] = null): AccounttaxListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccounttaxListResponse]
  }
}

