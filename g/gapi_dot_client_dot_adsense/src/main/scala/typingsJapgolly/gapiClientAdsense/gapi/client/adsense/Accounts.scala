package typingsJapgolly.gapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accounts extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The accounts returned in this list response. */
  var items: js.UndefOr[js.Array[Account]] = js.undefined
  /** Kind of list this is, in this case adsense#accounts. */
  var kind: js.UndefOr[String] = js.undefined
  /** Continuation token used to page through accounts. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Accounts {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Account] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Accounts = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
}

