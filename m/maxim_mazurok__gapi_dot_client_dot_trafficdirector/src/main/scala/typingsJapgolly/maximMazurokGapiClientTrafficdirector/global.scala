package typingsJapgolly.maximMazurokGapiClientTrafficdirector

import typingsJapgolly.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector.DiscoveryResource
import typingsJapgolly.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.trafficdirector
import typingsJapgolly.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.v2
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
      
      /** Load Traffic Director API v2 */
      inline def load(name: trafficdirector, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: trafficdirector, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object trafficdirector {
        
        @JSGlobal("gapi.client.trafficdirector.discovery")
        @js.native
        val discovery: DiscoveryResource = js.native
      }
    }
  }
}
