package typingsJapgolly.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventSourceResponse extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the SaaS partner that created the event source.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * The date and time that the event source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that the event source will expire if you don't create a matching event bus.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The state of the event source. If it's ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it's PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it's DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.native
}

object DescribeEventSourceResponse {
  @scala.inline
  def apply(
    Arn: String = null,
    CreatedBy: String = null,
    CreationTime: js.Date = null,
    ExpirationTime: js.Date = null,
    Name: String = null,
    State: EventSourceState = null
  ): DescribeEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSourceResponse]
  }
}

