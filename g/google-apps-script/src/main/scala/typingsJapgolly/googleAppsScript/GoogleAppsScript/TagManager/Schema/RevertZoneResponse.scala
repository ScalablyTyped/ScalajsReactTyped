package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertZoneResponse extends js.Object {
  var zone: js.UndefOr[Zone] = js.undefined
}

object RevertZoneResponse {
  @scala.inline
  def apply(zone: Zone = null): RevertZoneResponse = {
    val __obj = js.Dynamic.literal()
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertZoneResponse]
  }
}

