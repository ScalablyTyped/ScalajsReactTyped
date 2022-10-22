package typingsJapgolly.maximMazurokGapiClientServicenetworking

import typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.OperationsResource
import typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.ServicesResource
import typingsJapgolly.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.servicenetworking
import typingsJapgolly.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.v1
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
      
      /** Load Service Networking API v1 */
      inline def load(name: servicenetworking, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: servicenetworking, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object servicenetworking {
        
        @JSGlobal("gapi.client.servicenetworking.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.servicenetworking.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}
