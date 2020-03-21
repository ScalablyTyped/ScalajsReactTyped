package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultTableColumnHeader extends js.Object {
  var columnType: js.UndefOr[String] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ResultTableColumnHeader {
  @scala.inline
  def apply(columnType: String = null, dataType: String = null, name: String = null): ResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTableColumnHeader]
  }
}

