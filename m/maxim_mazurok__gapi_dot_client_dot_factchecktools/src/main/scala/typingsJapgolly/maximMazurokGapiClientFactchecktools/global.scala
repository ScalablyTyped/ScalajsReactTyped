package typingsJapgolly.maximMazurokGapiClientFactchecktools

import typingsJapgolly.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.ClaimsResource
import typingsJapgolly.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools.PagesResource
import typingsJapgolly.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.factchecktools
import typingsJapgolly.maximMazurokGapiClientFactchecktools.maximMazurokGapiClientFactchecktoolsStrings.v1alpha1
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
      
      object factchecktools {
        
        @JSGlobal("gapi.client.factchecktools.claims")
        @js.native
        val claims: ClaimsResource = js.native
        
        @JSGlobal("gapi.client.factchecktools.pages")
        @js.native
        val pages: PagesResource = js.native
      }
      
      /** Load Fact Check Tools API v1alpha1 */
      inline def load(name: factchecktools, version: v1alpha1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: factchecktools, version: v1alpha1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
