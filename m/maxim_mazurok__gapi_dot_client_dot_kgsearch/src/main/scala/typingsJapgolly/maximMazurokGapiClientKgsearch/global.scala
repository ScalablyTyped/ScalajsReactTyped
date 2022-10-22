package typingsJapgolly.maximMazurokGapiClientKgsearch

import typingsJapgolly.maximMazurokGapiClientKgsearch.gapi.client.kgsearch.EntitiesResource
import typingsJapgolly.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.kgsearch
import typingsJapgolly.maximMazurokGapiClientKgsearch.maximMazurokGapiClientKgsearchStrings.v1
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
      
      object kgsearch {
        
        @JSGlobal("gapi.client.kgsearch.entities")
        @js.native
        val entities: EntitiesResource = js.native
      }
      
      /** Load Knowledge Graph Search API v1 */
      inline def load(name: kgsearch, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: kgsearch, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
