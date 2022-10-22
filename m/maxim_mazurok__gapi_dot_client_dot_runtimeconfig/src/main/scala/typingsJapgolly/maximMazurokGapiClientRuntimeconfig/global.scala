package typingsJapgolly.maximMazurokGapiClientRuntimeconfig

import typingsJapgolly.maximMazurokGapiClientRuntimeconfig.gapi.client.runtimeconfig.OperationsResource
import typingsJapgolly.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.runtimeconfig
import typingsJapgolly.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.v1
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
      
      /** Load Cloud Runtime Configuration API v1 */
      inline def load(name: runtimeconfig, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: runtimeconfig, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object runtimeconfig {
        
        @JSGlobal("gapi.client.runtimeconfig.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
    }
  }
}
