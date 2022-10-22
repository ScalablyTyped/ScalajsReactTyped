package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELETED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EXECUTING
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PAUSED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PENDING_NEXT_RUN
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SCHEDULED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignStateMod {
  
  trait CampaignState extends StObject {
    
    /**
      * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign.
      *
      * Valid values: SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
      */
    var CampaignStatus: js.UndefOr[SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String] = js.undefined
  }
  object CampaignState {
    
    inline def apply(): CampaignState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignState]
    }
    
    extension [Self <: CampaignState](x: Self) {
      
      inline def setCampaignStatus(value: SCHEDULED | EXECUTING | PENDING_NEXT_RUN | COMPLETED | PAUSED | DELETED | String): Self = StObject.set(x, "CampaignStatus", value.asInstanceOf[js.Any])
      
      inline def setCampaignStatusUndefined: Self = StObject.set(x, "CampaignStatus", js.undefined)
    }
  }
  
  type UnmarshalledCampaignState = CampaignState
}
