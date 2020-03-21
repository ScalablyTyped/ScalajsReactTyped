package typingsJapgolly.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventBusRequest extends js.Object {
  /**
    * If you're creating a partner event bus, this specifies the partner event source that the new event bus will be matched with.
    */
  var EventSourceName: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.EventSourceName] = js.native
  /**
    * The name of the new event bus.  The names of custom event buses can't contain the / character. You can't use the name default for a custom event bus because this name is already used for your account's default event bus. If this is a partner event bus, the name must exactly match the name of the partner event source that this event bus is matched to. This name will include the / character.
    */
  var Name: EventBusName = js.native
}

object CreateEventBusRequest {
  @scala.inline
  def apply(Name: EventBusName, EventSourceName: EventSourceName = null): CreateEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (EventSourceName != null) __obj.updateDynamic("EventSourceName")(EventSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventBusRequest]
  }
}

