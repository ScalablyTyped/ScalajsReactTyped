package typingsJapgolly.three

import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersAudioLoaderMod {
  
  @JSImport("three/src/loaders/AudioLoader", "AudioLoader")
  @js.native
  open class AudioLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* audioBuffer */ AudioBuffer, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
}
