package typingsJapgolly.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsJapgolly.three.srcTexturesDataTextureMod.DataTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/DataTextureLoader", JSImport.Namespace)
@js.native
object srcLoadersDataTextureLoaderMod extends js.Object {
  @js.native
  class DataTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String, onLoad: js.Function1[/* dataTexture */ DataTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
  
}

