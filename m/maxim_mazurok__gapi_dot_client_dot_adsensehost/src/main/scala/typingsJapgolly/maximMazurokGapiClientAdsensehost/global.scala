package typingsJapgolly.maximMazurokGapiClientAdsensehost

import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typingsJapgolly.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.adsensehost
import typingsJapgolly.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.v4Dot1
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
      
      object adsensehost {
        
        @JSGlobal("gapi.client.adsensehost.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.adclients")
        @js.native
        val adclients: AdclientsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.associationsessions")
        @js.native
        val associationsessions: AssociationsessionsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.customchannels")
        @js.native
        val customchannels: CustomchannelsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.urlchannels")
        @js.native
        val urlchannels: UrlchannelsResource = js.native
      }
      
      /** Load AdSense Host API v4.1 */
      inline def load(name: adsensehost, version: v4Dot1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: adsensehost, version: v4Dot1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
