package typingsJapgolly.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "OutboundMessageStatus")
@js.native
object OutboundMessageStatus extends js.Object {
  /* "processed" */ val Processed: typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
  /* "queued" */ val Queued: typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
  /* "sent" */ val Sent: typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessageStatus with String
  ] = js.native
}

