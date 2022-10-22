package typingsJapgolly.maximMazurokGapiClientSts

import typingsJapgolly.maximMazurokGapiClientSts.gapi.client.sts.V1Resource
import typingsJapgolly.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.sts
import typingsJapgolly.maximMazurokGapiClientSts.maximMazurokGapiClientStsStrings.v1
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
      
      /** Load Security Token Service API v1 */
      inline def load(name: sts, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: sts, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object sts {
        
        @JSGlobal("gapi.client.sts.v1")
        @js.native
        val v1: V1Resource = js.native
      }
    }
  }
}
