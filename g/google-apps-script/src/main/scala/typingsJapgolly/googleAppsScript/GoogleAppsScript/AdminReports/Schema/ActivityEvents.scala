package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityEvents extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[js.Array[ActivityEventsParameters]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ActivityEvents {
  @scala.inline
  def apply(name: String = null, parameters: js.Array[ActivityEventsParameters] = null, `type`: String = null): ActivityEvents = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityEvents]
  }
}

