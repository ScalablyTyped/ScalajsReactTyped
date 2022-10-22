package typingsJapgolly.maximMazurokGapiClientAbusiveexperiencereport

import typingsJapgolly.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport.SitesResource
import typingsJapgolly.maximMazurokGapiClientAbusiveexperiencereport.gapi.client.abusiveexperiencereport.ViolatingSitesResource
import typingsJapgolly.maximMazurokGapiClientAbusiveexperiencereport.maximMazurokGapiClientAbusiveexperiencereportStrings.abusiveexperiencereport
import typingsJapgolly.maximMazurokGapiClientAbusiveexperiencereport.maximMazurokGapiClientAbusiveexperiencereportStrings.v1
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
      
      object abusiveexperiencereport {
        
        @JSGlobal("gapi.client.abusiveexperiencereport.sites")
        @js.native
        val sites: SitesResource = js.native
        
        @JSGlobal("gapi.client.abusiveexperiencereport.violatingSites")
        @js.native
        val violatingSites: ViolatingSitesResource = js.native
      }
      
      /** Load Abusive Experience Report API v1 */
      inline def load(name: abusiveexperiencereport, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: abusiveexperiencereport, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
