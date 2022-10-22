package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typingsJapgolly.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.UnmarshalledWriteTreatmentResource
import typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.WriteTreatmentResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteCampaignRequestMod {
  
  trait UnmarshalledWriteCampaignRequest
    extends StObject
       with WriteCampaignRequest {
    
    /**
      * Treatments that are defined in addition to the default treatment.
      */
    @JSName("AdditionalTreatments")
    var AdditionalTreatments_UnmarshalledWriteCampaignRequest: js.UndefOr[js.Array[UnmarshalledWriteTreatmentResource]] = js.undefined
    
    /**
      * Campaign hook information.
      */
    @JSName("Hook")
    var Hook_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
    
    /**
      * The campaign limits settings.
      */
    @JSName("Limits")
    var Limits_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
    
    /**
      * The message configuration settings.
      */
    @JSName("MessageConfiguration")
    var MessageConfiguration_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
    
    /**
      * The campaign schedule.
      */
    @JSName("Schedule")
    var Schedule_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledSchedule] = js.undefined
  }
  object UnmarshalledWriteCampaignRequest {
    
    inline def apply(): UnmarshalledWriteCampaignRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteCampaignRequest]
    }
    
    extension [Self <: UnmarshalledWriteCampaignRequest](x: Self) {
      
      inline def setAdditionalTreatments(value: js.Array[UnmarshalledWriteTreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      inline def setAdditionalTreatmentsVarargs(value: UnmarshalledWriteTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value*))
      
      inline def setHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "Hook", value.asInstanceOf[js.Any])
      
      inline def setHookUndefined: Self = StObject.set(x, "Hook", js.undefined)
      
      inline def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      inline def setSchedule(value: UnmarshalledSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    }
  }
  
  trait WriteCampaignRequest extends StObject {
    
    /**
      * Treatments that are defined in addition to the default treatment.
      */
    var AdditionalTreatments: js.UndefOr[js.Array[WriteTreatmentResource] | js.Iterable[WriteTreatmentResource]] = js.undefined
    
    /**
      * A description of the campaign.
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * The allocated percentage of end users who will not receive messages from this campaign.
      */
    var HoldoutPercent: js.UndefOr[Double] = js.undefined
    
    /**
      * Campaign hook information.
      */
    var Hook: js.UndefOr[CampaignHook] = js.undefined
    
    /**
      * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
      */
    var IsPaused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The campaign limits settings.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[
        typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
      ] = js.undefined
    
    /**
      * The custom name of the campaign.
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.undefined
    
    /**
      * The ID of the segment to which the campaign sends messages.
      */
    var SegmentId: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the segment to which the campaign sends messages.
      */
    var SegmentVersion: js.UndefOr[Double] = js.undefined
    
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[String] = js.undefined
    
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[String] = js.undefined
  }
  object WriteCampaignRequest {
    
    inline def apply(): WriteCampaignRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteCampaignRequest]
    }
    
    extension [Self <: WriteCampaignRequest](x: Self) {
      
      inline def setAdditionalTreatments(value: js.Array[WriteTreatmentResource] | js.Iterable[WriteTreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      inline def setAdditionalTreatmentsVarargs(value: WriteTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setHoldoutPercent(value: Double): Self = StObject.set(x, "HoldoutPercent", value.asInstanceOf[js.Any])
      
      inline def setHoldoutPercentUndefined: Self = StObject.set(x, "HoldoutPercent", js.undefined)
      
      inline def setHook(value: CampaignHook): Self = StObject.set(x, "Hook", value.asInstanceOf[js.Any])
      
      inline def setHookUndefined: Self = StObject.set(x, "Hook", js.undefined)
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "IsPaused", value.asInstanceOf[js.Any])
      
      inline def setIsPausedUndefined: Self = StObject.set(x, "IsPaused", js.undefined)
      
      inline def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      inline def setSegmentId(value: String): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
      
      inline def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
      
      inline def setSegmentVersion(value: Double): Self = StObject.set(x, "SegmentVersion", value.asInstanceOf[js.Any])
      
      inline def setSegmentVersionUndefined: Self = StObject.set(x, "SegmentVersion", js.undefined)
      
      inline def setTreatmentDescription(value: String): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
      
      inline def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
      
      inline def setTreatmentName(value: String): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
      
      inline def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
    }
  }
}
