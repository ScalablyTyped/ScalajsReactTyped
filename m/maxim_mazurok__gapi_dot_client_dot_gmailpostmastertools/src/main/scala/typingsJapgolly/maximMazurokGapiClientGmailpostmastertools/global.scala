package typingsJapgolly.maximMazurokGapiClientGmailpostmastertools

import typingsJapgolly.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools.DomainsResource
import typingsJapgolly.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.gmailpostmastertools
import typingsJapgolly.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.v1
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
      
      object gmailpostmastertools {
        
        @JSGlobal("gapi.client.gmailpostmastertools.domains")
        @js.native
        val domains: DomainsResource = js.native
      }
      
      /** Load Gmail Postmaster Tools API v1 */
      inline def load(name: gmailpostmastertools, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: gmailpostmastertools, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
