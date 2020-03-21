package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItem extends js.Object {
  var errors: js.UndefOr[Errors] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[GroupItemResource] = js.undefined
}

object GroupItem {
  @scala.inline
  def apply(
    errors: Errors = null,
    etag: String = null,
    groupId: String = null,
    id: String = null,
    kind: String = null,
    resource: GroupItemResource = null
  ): GroupItem = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupItem]
  }
}

