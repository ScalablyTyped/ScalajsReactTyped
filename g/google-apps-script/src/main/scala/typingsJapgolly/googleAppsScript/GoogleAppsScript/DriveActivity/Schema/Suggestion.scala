package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var subtype: js.UndefOr[String] = js.undefined
}

object Suggestion {
  @scala.inline
  def apply(subtype: String = null): Suggestion = {
    val __obj = js.Dynamic.literal()
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
}

