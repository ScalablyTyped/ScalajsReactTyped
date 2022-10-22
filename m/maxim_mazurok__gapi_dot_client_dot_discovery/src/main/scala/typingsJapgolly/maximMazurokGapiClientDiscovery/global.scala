package typingsJapgolly.maximMazurokGapiClientDiscovery

import typingsJapgolly.maximMazurokGapiClientDiscovery.gapi.client.discovery.ApisResource
import typingsJapgolly.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.discovery
import typingsJapgolly.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.v1
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
      
      object discovery {
        
        @JSGlobal("gapi.client.discovery.apis")
        @js.native
        val apis: ApisResource = js.native
      }
      
      /** Load API Discovery Service v1 */
      inline def load(name: discovery, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: discovery, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
