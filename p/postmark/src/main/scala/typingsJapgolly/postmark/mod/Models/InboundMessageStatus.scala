package typingsJapgolly.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.InboundMessageStatus")
@js.native
object InboundMessageStatus extends js.Object {
  /* "blocked" */ val Blocked: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
  /* "failed" */ val Failed: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
  /* "processed" */ val Processed: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
  /* "queued" */ val Queued: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
  /* "scheduled" */ val Scheduled: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
  /* "sent" */ val Sent: typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsJapgolly.postmark.messageFilteringParametersMod.InboundMessageStatus with String
  ] = js.native
}

