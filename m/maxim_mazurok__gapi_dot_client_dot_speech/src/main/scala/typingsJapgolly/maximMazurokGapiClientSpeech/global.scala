package typingsJapgolly.maximMazurokGapiClientSpeech

import typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech.OperationsResource
import typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech.SpeechResource
import typingsJapgolly.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.speech
import typingsJapgolly.maximMazurokGapiClientSpeech.maximMazurokGapiClientSpeechStrings.v1
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
      
      /** Load Cloud Speech-to-Text API v1 */
      inline def load(name: speech, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: speech, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object speech {
        
        @JSGlobal("gapi.client.speech.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.speech.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.speech.speech")
        @js.native
        val speech: SpeechResource = js.native
      }
    }
  }
}
