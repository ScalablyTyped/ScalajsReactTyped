package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignment extends js.Object {
  var subtype: js.UndefOr[String] = js.undefined
}

object Assignment {
  @scala.inline
  def apply(subtype: String = null): Assignment = {
    val __obj = js.Dynamic.literal()
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
}

