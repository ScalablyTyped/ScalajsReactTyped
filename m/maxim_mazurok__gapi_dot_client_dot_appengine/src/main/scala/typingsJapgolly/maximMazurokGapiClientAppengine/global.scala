package typingsJapgolly.maximMazurokGapiClientAppengine

import typingsJapgolly.maximMazurokGapiClientAppengine.gapi.client.appengine.AppsResource
import typingsJapgolly.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.appengine
import typingsJapgolly.maximMazurokGapiClientAppengine.maximMazurokGapiClientAppengineStrings.v1
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
      
      object appengine {
        
        @JSGlobal("gapi.client.appengine.apps")
        @js.native
        val apps: AppsResource = js.native
      }
      
      /** Load App Engine Admin API v1 */
      inline def load(name: appengine, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: appengine, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
