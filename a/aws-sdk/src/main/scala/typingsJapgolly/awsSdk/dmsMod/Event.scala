package typingsJapgolly.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The date of the event.
    */
  var Date: js.UndefOr[js.Date] = js.native
  /**
    * The event categories available for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The event message.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | endpoint | replication-task
    */
  var SourceType: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.SourceType] = js.native
}

object Event {
  @scala.inline
  def apply(
    Date: js.Date = null,
    EventCategories: EventCategoriesList = null,
    Message: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

