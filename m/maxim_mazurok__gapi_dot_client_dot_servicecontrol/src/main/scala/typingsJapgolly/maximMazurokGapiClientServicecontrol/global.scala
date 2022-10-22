package typingsJapgolly.maximMazurokGapiClientServicecontrol

import typingsJapgolly.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typingsJapgolly.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.servicecontrol
import typingsJapgolly.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.v2
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
      
      /** Load Service Control API v2 */
      inline def load(name: servicecontrol, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: servicecontrol, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object servicecontrol {
        
        @JSGlobal("gapi.client.servicecontrol.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}
