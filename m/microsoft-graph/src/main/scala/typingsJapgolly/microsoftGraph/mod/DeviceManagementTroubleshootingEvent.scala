package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementTroubleshootingEvent extends Entity {
  // Id used for tracing the failure in the service.
  var correlationId: js.UndefOr[String] = js.undefined
  // Time when the event occurred .
  var eventDateTime: js.UndefOr[String] = js.undefined
}

object DeviceManagementTroubleshootingEvent {
  @scala.inline
  def apply(correlationId: String = null, eventDateTime: String = null, id: String = null): DeviceManagementTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (eventDateTime != null) __obj.updateDynamic("eventDateTime")(eventDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManagementTroubleshootingEvent]
  }
}

