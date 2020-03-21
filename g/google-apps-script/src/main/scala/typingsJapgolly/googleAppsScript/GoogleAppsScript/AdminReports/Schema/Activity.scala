package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var actor: js.UndefOr[ActivityActor] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var events: js.UndefOr[js.Array[ActivityEvents]] = js.undefined
  var id: js.UndefOr[ActivityId] = js.undefined
  var ipAddress: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var ownerDomain: js.UndefOr[String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    actor: ActivityActor = null,
    etag: String = null,
    events: js.Array[ActivityEvents] = null,
    id: ActivityId = null,
    ipAddress: String = null,
    kind: String = null,
    ownerDomain: String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

