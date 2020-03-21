package typingsJapgolly.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsResultEntry extends js.Object {
  /**
    * The error code that indicates why the event submission failed.
    */
  var ErrorCode: js.UndefOr[typingsJapgolly.awsSdk.eventbridgeMod.ErrorCode] = js.native
  /**
    * The error message that explains why the event submission failed.
    */
  var ErrorMessage: js.UndefOr[typingsJapgolly.awsSdk.eventbridgeMod.ErrorMessage] = js.native
  /**
    * The ID of the event.
    */
  var EventId: js.UndefOr[typingsJapgolly.awsSdk.eventbridgeMod.EventId] = js.native
}

object PutPartnerEventsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, EventId: EventId = null): PutPartnerEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (EventId != null) __obj.updateDynamic("EventId")(EventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsResultEntry]
  }
}

