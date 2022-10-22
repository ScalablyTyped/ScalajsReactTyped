package typingsJapgolly.postmark.distClientModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "CreateServerRequest")
@js.native
open class CreateServerRequest protected ()
  extends typingsJapgolly.postmark.distClientModelsServerServerMod.CreateServerRequest {
  def this(
    Name: String,
    Color: js.UndefOr[String],
    SmtpApiActivated: js.UndefOr[Boolean],
    RawEmailEnabled: js.UndefOr[Boolean],
    InboundHookUrl: js.UndefOr[String],
    BounceHookUrl: js.UndefOr[String],
    OpenHookUrl: js.UndefOr[String],
    DeliveryHookUrl: js.UndefOr[String],
    ClickHookUrl: js.UndefOr[String],
    PostFirstOpenOnly: js.UndefOr[Boolean],
    InboundSpamThreshold: js.UndefOr[Double],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[
        typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
      ],
    IncludeBounceContentInHook: js.UndefOr[Boolean],
    EnableSmtpApiErrorHooks: js.UndefOr[Boolean],
    InboundDomain: js.UndefOr[String],
    DeliveryType: js.UndefOr[
        typingsJapgolly.postmark.distClientModelsMessageSupportingTypesMod.ServerDeliveryTypes
      ]
  ) = this()
}
