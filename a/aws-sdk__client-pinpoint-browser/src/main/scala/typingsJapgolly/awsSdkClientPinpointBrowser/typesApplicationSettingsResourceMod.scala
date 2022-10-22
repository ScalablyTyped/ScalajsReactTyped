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

object typesApplicationSettingsResourceMod {
  
  trait ApplicationSettingsResource extends StObject {
    
    /**
      * The unique ID for the application.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * Default campaign hook.
      */
    var CampaignHook: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.undefined
    
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
      */
    var Limits: js.UndefOr[CampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    var QuietTime: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
  }
  object ApplicationSettingsResource {
    
    inline def apply(): ApplicationSettingsResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationSettingsResource]
    }
    
    extension [Self <: ApplicationSettingsResource](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCampaignHook(value: CampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      inline def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
  
  trait UnmarshalledApplicationSettingsResource
    extends StObject
       with ApplicationSettingsResource {
    
    /**
      * Default campaign hook.
      */
    @JSName("CampaignHook")
    var CampaignHook_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
    
    /**
      * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
      */
    @JSName("Limits")
    var Limits_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
    
    /**
      * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
      */
    @JSName("QuietTime")
    var QuietTime_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledQuietTime] = js.undefined
  }
  object UnmarshalledApplicationSettingsResource {
    
    inline def apply(): UnmarshalledApplicationSettingsResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledApplicationSettingsResource]
    }
    
    extension [Self <: UnmarshalledApplicationSettingsResource](x: Self) {
      
      inline def setCampaignHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "CampaignHook", value.asInstanceOf[js.Any])
      
      inline def setCampaignHookUndefined: Self = StObject.set(x, "CampaignHook", js.undefined)
      
      inline def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      inline def setQuietTime(value: UnmarshalledQuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
      
      inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    }
  }
}
