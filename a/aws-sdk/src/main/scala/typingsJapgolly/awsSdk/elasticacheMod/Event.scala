package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The date and time when the event occurred.
    */
  var Date: js.UndefOr[js.Date] = js.native
  /**
    * The text of the event.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The identifier for the source of the event. For example, if the event occurred at the cluster level, the identifier would be the name of the cluster.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the origin of this event - a cluster, a parameter group, a security group, etc.
    */
  var SourceType: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.SourceType] = js.native
}

object Event {
  @scala.inline
  def apply(
    Date: js.Date = null,
    Message: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

