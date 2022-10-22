package typingsJapgolly.maximMazurokGapiClientSmartdevicemanagement

import typingsJapgolly.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement.EnterprisesResource
import typingsJapgolly.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.smartdevicemanagement
import typingsJapgolly.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.v1
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
      
      /** Load Smart Device Management API v1 */
      inline def load(name: smartdevicemanagement, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: smartdevicemanagement, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object smartdevicemanagement {
        
        @JSGlobal("gapi.client.smartdevicemanagement.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
      }
    }
  }
}
