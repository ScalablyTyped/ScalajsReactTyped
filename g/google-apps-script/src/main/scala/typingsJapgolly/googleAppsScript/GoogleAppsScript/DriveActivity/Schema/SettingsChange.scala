package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsChange extends js.Object {
  var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.undefined
}

object SettingsChange {
  @scala.inline
  def apply(restrictionChanges: js.Array[RestrictionChange] = null): SettingsChange = {
    val __obj = js.Dynamic.literal()
    if (restrictionChanges != null) __obj.updateDynamic("restrictionChanges")(restrictionChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsChange]
  }
}

