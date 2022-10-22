package typingsJapgolly.maximMazurokGapiClientTexttospeech

import typingsJapgolly.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.TextResource
import typingsJapgolly.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech.VoicesResource
import typingsJapgolly.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.texttospeech
import typingsJapgolly.maximMazurokGapiClientTexttospeech.maximMazurokGapiClientTexttospeechStrings.v1
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
      
      /** Load Cloud Text-to-Speech API v1 */
      inline def load(name: texttospeech, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: texttospeech, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object texttospeech {
        
        @JSGlobal("gapi.client.texttospeech.text")
        @js.native
        val text: TextResource = js.native
        
        @JSGlobal("gapi.client.texttospeech.voices")
        @js.native
        val voices: VoicesResource = js.native
      }
    }
  }
}
