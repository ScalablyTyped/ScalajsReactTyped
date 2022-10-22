package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typingsJapgolly.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import typingsJapgolly.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteApplicationSettingsRequestMod {
  
  trait UnmarshalledWriteApplicationSettingsRequest
    extends StObject
       with WriteApplicationSettingsRequest {
    
    /**
      * Default campaign hook information.
      */
    @JSName("CampaignHook")
    var CampaignHook_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
    
    /**
      * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
      */
    @JSName("Limits")
    var Limits_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    @JSName("QuietTime")
    var QuietTime_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledQuietTime] = js.undefined
  }
  object UnmarshalledWriteApplicationSettingsRequest {
    
    inline def apply(): UnmarshalledWriteApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteApplicationSettingsRequest]
    }
    
    extension [Self <: UnmarshalledWriteApplicationSettingsRequest](x: Self) {
      
      inline def setCampaignHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      inline def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      inline def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setQuietTime(value: UnmarshalledQuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
  
  trait WriteApplicationSettingsRequest extends StObject {
    
    /**
      * Default campaign hook information.
      */
    var CampaignHook: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.undefined
    
    /**
      * The CloudWatchMetrics settings for the app.
      */
    var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    var QuietTime: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
  }
  object WriteApplicationSettingsRequest {
    
    inline def apply(): WriteApplicationSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteApplicationSettingsRequest]
    }
    
    extension [Self <: WriteApplicationSettingsRequest](x: Self) {
      
      inline def setCampaignHook(value: CampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      inline def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      inline def setCloudWatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
      
      inline def setCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "CloudWatchMetricsEnabled", js.undefined)
      
      inline def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
}
