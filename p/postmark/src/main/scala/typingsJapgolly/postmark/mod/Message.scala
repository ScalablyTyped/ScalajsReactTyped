package typingsJapgolly.postmark.mod

import typingsJapgolly.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsJapgolly.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Message")
@js.native
class Message protected ()
  extends typingsJapgolly.postmark.modelsMod.Message {
  def this(
    From: String,
    Subject: String,
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    ReplyTo: js.UndefOr[String],
    Tag: js.UndefOr[String],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[LinkTrackingOptions],
    Headers: js.UndefOr[js.Array[typingsJapgolly.postmark.messageSupportingTypesMod.Header]],
    Attachments: js.UndefOr[js.Array[typingsJapgolly.postmark.messageSupportingTypesMod.Attachment]],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}

