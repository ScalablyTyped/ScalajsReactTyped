package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsResult extends js.Object {
  /**
    * A list of SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.EventTopics] = js.native
}

object DescribeEventTopicsResult {
  @scala.inline
  def apply(EventTopics: EventTopics = null): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    if (EventTopics != null) __obj.updateDynamic("EventTopics")(EventTopics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
}

