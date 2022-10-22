package typingsJapgolly.maximMazurokGapiClientIdentitytoolkit

import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit.RelyingpartyResource
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.identitytoolkit
import typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.v3
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
      
      object identitytoolkit {
        
        @JSGlobal("gapi.client.identitytoolkit.relyingparty")
        @js.native
        val relyingparty: RelyingpartyResource = js.native
      }
      
      /** Load Google Identity Toolkit API v3 */
      inline def load(name: identitytoolkit, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: identitytoolkit, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
