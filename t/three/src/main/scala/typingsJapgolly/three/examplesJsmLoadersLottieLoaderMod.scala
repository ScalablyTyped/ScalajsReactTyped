package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.CanvasTexture
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersLottieLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/LottieLoader", "LottieLoader")
  @js.native
  open class LottieLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* texture */ CanvasTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CanvasTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CanvasTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CanvasTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def setQuality(value: Double): Unit = js.native
  }
}
