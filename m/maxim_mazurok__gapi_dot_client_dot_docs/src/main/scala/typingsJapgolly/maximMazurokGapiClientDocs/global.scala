package typingsJapgolly.maximMazurokGapiClientDocs

import typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs.DocumentsResource
import typingsJapgolly.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.docs
import typingsJapgolly.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.v1
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
      
      object docs {
        
        @JSGlobal("gapi.client.docs.documents")
        @js.native
        val documents: DocumentsResource = js.native
      }
      
      /** Load Google Docs API v1 */
      inline def load(name: docs, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: docs, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
