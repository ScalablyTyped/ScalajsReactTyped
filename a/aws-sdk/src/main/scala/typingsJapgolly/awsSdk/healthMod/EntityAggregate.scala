package typingsJapgolly.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAggregate extends js.Object {
  /**
    * The number entities that match the criteria for the specified events.
    */
  var count: js.UndefOr[typingsJapgolly.awsSdk.healthMod.count] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typingsJapgolly.awsSdk.healthMod.eventArn] = js.native
}

object EntityAggregate {
  @scala.inline
  def apply(count: Int | Double = null, eventArn: eventArn = null): EntityAggregate = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityAggregate]
  }
}

