package typingsJapgolly.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "OutboundMessagesFilteringParameters")
@js.native
class OutboundMessagesFilteringParameters protected ()
  extends typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessagesFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    recipient: js.UndefOr[String],
    fromEmail: js.UndefOr[String],
    tag: js.UndefOr[String],
    status: js.UndefOr[typingsJapgolly.postmark.messageFilteringParametersMod.OutboundMessageStatus],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    subject: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}

