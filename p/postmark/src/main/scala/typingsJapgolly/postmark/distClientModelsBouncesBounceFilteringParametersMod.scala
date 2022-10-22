package typingsJapgolly.postmark

import typingsJapgolly.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsBouncesBounceFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceFilteringParameters")
  @js.native
  open class BounceFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      `type`: js.UndefOr[BounceType],
      inactive: js.UndefOr[Boolean],
      emailFilter: js.UndefOr[String],
      tag: js.UndefOr[String],
      messageID: js.UndefOr[String],
      fromDate: js.UndefOr[String],
      toDate: js.UndefOr[String],
      messageStream: js.UndefOr[String]
    ) = this()
    
    var emailFilter: js.UndefOr[String] = js.native
    
    var fromDate: js.UndefOr[String] = js.native
    
    var inactive: js.UndefOr[Boolean] = js.native
    
    var messageID: js.UndefOr[String] = js.native
    
    var messageStream: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var toDate: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[BounceType] = js.native
  }
  
  @js.native
  sealed trait BounceType extends StObject
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
  @js.native
  object BounceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BounceType & String] = js.native
    
    @js.native
    sealed trait AddressChange
      extends StObject
         with BounceType
    /* "AddressChange" */ val AddressChange: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AddressChange & String = js.native
    
    @js.native
    sealed trait AutoResponder
      extends StObject
         with BounceType
    /* "AutoResponder" */ val AutoResponder: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AutoResponder & String = js.native
    
    @js.native
    sealed trait BadEmailAddress
      extends StObject
         with BounceType
    /* "BadEmailAddress" */ val BadEmailAddress: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.BadEmailAddress & String = js.native
    
    @js.native
    sealed trait Blocked
      extends StObject
         with BounceType
    /* "Blocked" */ val Blocked: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Blocked & String = js.native
    
    @js.native
    sealed trait ChallengeVerification
      extends StObject
         with BounceType
    /* "ChallengeVerification" */ val ChallengeVerification: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ChallengeVerification & String = js.native
    
    @js.native
    sealed trait DMARCPolicy
      extends StObject
         with BounceType
    /* "DMARCPolicy" */ val DMARCPolicy: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DMARCPolicy & String = js.native
    
    @js.native
    sealed trait DnsError
      extends StObject
         with BounceType
    /* "DnsError" */ val DnsError: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DnsError & String = js.native
    
    @js.native
    sealed trait HardBounce
      extends StObject
         with BounceType
    /* "HardBounce" */ val HardBounce: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.HardBounce & String = js.native
    
    @js.native
    sealed trait InboundError
      extends StObject
         with BounceType
    /* "InboundError" */ val InboundError: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.InboundError & String = js.native
    
    @js.native
    sealed trait ManuallyDeactivated
      extends StObject
         with BounceType
    /* "ManuallyDeactivated" */ val ManuallyDeactivated: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ManuallyDeactivated & String = js.native
    
    @js.native
    sealed trait OpenRelayTest
      extends StObject
         with BounceType
    /* "OpenRelayTest" */ val OpenRelayTest: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.OpenRelayTest & String = js.native
    
    @js.native
    sealed trait SMTPApiError
      extends StObject
         with BounceType
    /* "SMTPApiError" */ val SMTPApiError: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SMTPApiError & String = js.native
    
    @js.native
    sealed trait SoftBounce
      extends StObject
         with BounceType
    /* "SoftBounce" */ val SoftBounce: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SoftBounce & String = js.native
    
    @js.native
    sealed trait SpamComplaint
      extends StObject
         with BounceType
    /* "SpamComplaint" */ val SpamComplaint: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamComplaint & String = js.native
    
    @js.native
    sealed trait SpamNotification
      extends StObject
         with BounceType
    /* "SpamNotification" */ val SpamNotification: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamNotification & String = js.native
    
    @js.native
    sealed trait Subscribe
      extends StObject
         with BounceType
    /* "Subscribe" */ val Subscribe: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Subscribe & String = js.native
    
    @js.native
    sealed trait TemplateRenderingFailed
      extends StObject
         with BounceType
    /* "TemplateRenderingFailed" */ val TemplateRenderingFailed: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.TemplateRenderingFailed & String = js.native
    
    @js.native
    sealed trait Transient
      extends StObject
         with BounceType
    /* "Transient" */ val Transient: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Transient & String = js.native
    
    @js.native
    sealed trait Unconfirmed
      extends StObject
         with BounceType
    /* "Unconfirmed" */ val Unconfirmed: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unconfirmed & String = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with BounceType
    /* "Unknown" */ val Unknown: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unknown & String = js.native
    
    @js.native
    sealed trait Unsubscribe
      extends StObject
         with BounceType
    /* "Unsubscribe" */ val Unsubscribe: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unsubscribe & String = js.native
    
    @js.native
    sealed trait VirusNotification
      extends StObject
         with BounceType
    /* "VirusNotification" */ val VirusNotification: typingsJapgolly.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.VirusNotification & String = js.native
  }
}
