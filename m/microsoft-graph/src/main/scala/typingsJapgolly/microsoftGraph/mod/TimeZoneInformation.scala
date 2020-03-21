package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZoneInformation extends js.Object {
  // An identifier for the time zone.
  var alias: js.UndefOr[String] = js.undefined
  // A display string that represents the time zone.
  var displayName: js.UndefOr[String] = js.undefined
}

object TimeZoneInformation {
  @scala.inline
  def apply(alias: String = null, displayName: String = null): TimeZoneInformation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneInformation]
  }
}

