package typingsJapgolly.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypeSummary extends js.Object {
  /**
    * The system-generated ID of the event.
    */
  var EventTypeId: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.EventTypeId] = js.native
  /**
    * The name of the event.
    */
  var EventTypeName: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.EventTypeName] = js.native
  /**
    * The resource type of the event.
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.ResourceType] = js.native
  /**
    * The name of the service for which the event applies.
    */
  var ServiceName: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.ServiceName] = js.native
}

object EventTypeSummary {
  @scala.inline
  def apply(
    EventTypeId: EventTypeId = null,
    EventTypeName: EventTypeName = null,
    ResourceType: ResourceType = null,
    ServiceName: ServiceName = null
  ): EventTypeSummary = {
    val __obj = js.Dynamic.literal()
    if (EventTypeId != null) __obj.updateDynamic("EventTypeId")(EventTypeId.asInstanceOf[js.Any])
    if (EventTypeName != null) __obj.updateDynamic("EventTypeName")(EventTypeName.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypeSummary]
  }
}

