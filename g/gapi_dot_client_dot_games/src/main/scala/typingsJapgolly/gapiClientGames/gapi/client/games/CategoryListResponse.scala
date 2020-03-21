package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryListResponse extends js.Object {
  /** The list of categories with usage data. */
  var items: js.UndefOr[js.Array[Category]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#categoryListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CategoryListResponse {
  @scala.inline
  def apply(items: js.Array[Category] = null, kind: String = null, nextPageToken: String = null): CategoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryListResponse]
  }
}

