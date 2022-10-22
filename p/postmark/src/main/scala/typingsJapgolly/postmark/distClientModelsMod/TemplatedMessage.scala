package typingsJapgolly.postmark.distClientModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "TemplatedMessage")
@js.native
open class TemplatedMessage protected ()
  extends typingsJapgolly.postmark.distClientModelsTemplatesTemplateMod.TemplatedMessage {
  def this(
    from: String,
    templateIdOrAlias: Double | String,
    templateModel: js.Object,
    to: js.UndefOr[String],
    cc: js.UndefOr[String],
    bcc: js.UndefOr[String],
    replyTo: js.UndefOr[String],
    tag: js.UndefOr[String],
    trackOpens: js.UndefOr[Boolean],
    trackLinks: js.UndefOr[
        typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
      ],
    headers: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Header]
      ],
    attachments: js.UndefOr[
        js.Array[typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.Attachment]
      ]
  ) = this()
}
