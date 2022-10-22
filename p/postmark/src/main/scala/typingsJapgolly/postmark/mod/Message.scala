package typingsJapgolly.postmark.mod

import typingsJapgolly.postmark.distClientModelsClientSupportingTypesMod.Hash
import typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Message")
@js.native
open class Message protected ()
  extends typingsJapgolly.postmark.distClientModelsMod.Message {
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
    Headers: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Header]
      ],
    Attachments: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Attachment]
      ],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}
