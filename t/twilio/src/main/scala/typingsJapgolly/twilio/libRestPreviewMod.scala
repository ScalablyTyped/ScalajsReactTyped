package typingsJapgolly.twilio

import typingsJapgolly.twilio.libRestPreviewDeployedDevicesFleetMod.FleetContext
import typingsJapgolly.twilio.libRestPreviewDeployedDevicesFleetMod.FleetListInstance
import typingsJapgolly.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentContext
import typingsJapgolly.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentListInstance
import typingsJapgolly.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderContext
import typingsJapgolly.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderListInstance
import typingsJapgolly.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnContext
import typingsJapgolly.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnListInstance
import typingsJapgolly.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnContext
import typingsJapgolly.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnListInstance
import typingsJapgolly.twilio.libRestPreviewSyncServiceMod.ServiceContext
import typingsJapgolly.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import typingsJapgolly.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelContext
import typingsJapgolly.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelListInstance
import typingsJapgolly.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationContext
import typingsJapgolly.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationListInstance
import typingsJapgolly.twilio.libRestPreviewTrustedCommsCpsMod.CpsContext
import typingsJapgolly.twilio.libRestPreviewTrustedCommsCpsMod.CpsListInstance
import typingsJapgolly.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallContext
import typingsJapgolly.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallListInstance
import typingsJapgolly.twilio.libRestPreviewUnderstandAssistantMod.AssistantContext
import typingsJapgolly.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import typingsJapgolly.twilio.libRestPreviewWirelessCommandMod.CommandContext
import typingsJapgolly.twilio.libRestPreviewWirelessCommandMod.CommandListInstance
import typingsJapgolly.twilio.libRestPreviewWirelessRatePlanMod.RatePlanContext
import typingsJapgolly.twilio.libRestPreviewWirelessRatePlanMod.RatePlanListInstance
import typingsJapgolly.twilio.libRestPreviewWirelessSimMod.SimContext
import typingsJapgolly.twilio.libRestPreviewWirelessSimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMod {
  
  @JSImport("twilio/lib/rest/Preview", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Preview {
    /**
      * Initialize preview domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typingsJapgolly.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Preview
    extends typingsJapgolly.twilio.libBaseDomainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def authorizationDocuments(sid: String): AuthorizationDocumentContext = js.native
    @JSName("authorizationDocuments")
    val authorizationDocuments_Original: AuthorizationDocumentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def availableAddOns(sid: String): AvailableAddOnContext = js.native
    @JSName("availableAddOns")
    val availableAddOns_Original: AvailableAddOnListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def brandedChannels(sid: String): BrandedChannelContext = js.native
    @JSName("brandedChannels")
    val brandedChannels_Original: BrandedChannelListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def brandsInformation(sid: String): BrandsInformationContext = js.native
    @JSName("brandsInformation")
    val brandsInformation_Original: BrandsInformationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def commands(sid: String): CommandContext = js.native
    @JSName("commands")
    val commands_Original: CommandListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def cps(sid: String): CpsContext = js.native
    @JSName("cps")
    val cps_Original: CpsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def currentCalls(sid: String): CurrentCallContext = js.native
    @JSName("currentCalls")
    val currentCalls_Original: CurrentCallListInstance = js.native
    
    val deployed_devices: typingsJapgolly.twilio.libRestPreviewDeployedDevicesMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fleets(sid: String): FleetContext = js.native
    @JSName("fleets")
    val fleets_Original: FleetListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def hostedNumberOrders(sid: String): HostedNumberOrderContext = js.native
    @JSName("hostedNumberOrders")
    val hostedNumberOrders_Original: HostedNumberOrderListInstance = js.native
    
    val hosted_numbers: typingsJapgolly.twilio.libRestPreviewHostedNumbersMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def installedAddOns(sid: String): InstalledAddOnContext = js.native
    @JSName("installedAddOns")
    val installedAddOns_Original: InstalledAddOnListInstance = js.native
    
    val marketplace: typingsJapgolly.twilio.libRestPreviewMarketplaceMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ratePlans(sid: String): RatePlanContext = js.native
    @JSName("ratePlans")
    val ratePlans_Original: RatePlanListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sims(sid: String): SimContext = js.native
    @JSName("sims")
    val sims_Original: SimListInstance = js.native
    
    val sync: typingsJapgolly.twilio.libRestPreviewSyncMod.^ = js.native
    
    val trusted_comms: typingsJapgolly.twilio.libRestPreviewTrustedCommsMod.^ = js.native
    
    val understand: typingsJapgolly.twilio.libRestPreviewUnderstandMod.^ = js.native
    
    val wireless: typingsJapgolly.twilio.libRestPreviewWirelessMod.^ = js.native
  }
}
