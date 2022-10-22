package typingsJapgolly.maximMazurokGapiClientTranscoder

import typingsJapgolly.maximMazurokGapiClientTranscoder.gapi.client.transcoder.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.transcoder
import typingsJapgolly.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.v1
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
      
      /** Load Transcoder API v1 */
      inline def load(name: transcoder, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: transcoder, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object transcoder {
        
        @JSGlobal("gapi.client.transcoder.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
