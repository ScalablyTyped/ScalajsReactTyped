package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(
    etag: String = null,
    groups: js.Array[Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

