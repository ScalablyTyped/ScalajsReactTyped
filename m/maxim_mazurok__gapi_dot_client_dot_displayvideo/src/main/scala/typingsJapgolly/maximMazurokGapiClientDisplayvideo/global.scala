package typingsJapgolly.maximMazurokGapiClientDisplayvideo

import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.AdvertisersResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CombinedAudiencesResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomBiddingAlgorithmsResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomListsResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FirstAndThirdPartyAudiencesResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FloodlightGroupsResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.GoogleAudiencesResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.GuaranteedOrdersResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourceGroupsResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourcesResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.MediaResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.PartnersResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.SdfdownloadtasksResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.TargetingTypesResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.UsersResource
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.displayvideo
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.v1
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object displayvideo {
        
        @JSGlobal("gapi.client.displayvideo.advertisers")
        @js.native
        val advertisers: AdvertisersResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.combinedAudiences")
        @js.native
        val combinedAudiences: CombinedAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.customBiddingAlgorithms")
        @js.native
        val customBiddingAlgorithms: CustomBiddingAlgorithmsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.customLists")
        @js.native
        val customLists: CustomListsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.firstAndThirdPartyAudiences")
        @js.native
        val firstAndThirdPartyAudiences: FirstAndThirdPartyAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.floodlightGroups")
        @js.native
        val floodlightGroups: FloodlightGroupsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.googleAudiences")
        @js.native
        val googleAudiences: GoogleAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.guaranteedOrders")
        @js.native
        val guaranteedOrders: GuaranteedOrdersResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.inventorySourceGroups")
        @js.native
        val inventorySourceGroups: InventorySourceGroupsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.inventorySources")
        @js.native
        val inventorySources: InventorySourcesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.partners")
        @js.native
        val partners: PartnersResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.sdfdownloadtasks")
        @js.native
        val sdfdownloadtasks: SdfdownloadtasksResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.targetingTypes")
        @js.native
        val targetingTypes: TargetingTypesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Display & Video 360 API v1 */
      inline def load(name: displayvideo, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: displayvideo, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
