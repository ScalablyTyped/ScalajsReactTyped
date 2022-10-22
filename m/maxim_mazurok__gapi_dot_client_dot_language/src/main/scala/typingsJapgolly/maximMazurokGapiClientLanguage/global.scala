package typingsJapgolly.maximMazurokGapiClientLanguage

import typingsJapgolly.maximMazurokGapiClientLanguage.gapi.client.language.DocumentsResource
import typingsJapgolly.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.language
import typingsJapgolly.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.v1
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
      
      object language {
        
        @JSGlobal("gapi.client.language.documents")
        @js.native
        val documents: DocumentsResource = js.native
      }
      
      /** Load Cloud Natural Language API v1 */
      inline def load(name: language, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: language, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
