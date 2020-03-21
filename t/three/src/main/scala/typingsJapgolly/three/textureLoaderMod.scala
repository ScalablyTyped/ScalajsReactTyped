package typingsJapgolly.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.three.loaderMod.Loader
import typingsJapgolly.three.loadingManagerMod.LoadingManager
import typingsJapgolly.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/TextureLoader", JSImport.Namespace)
@js.native
object textureLoaderMod extends js.Object {
  @js.native
  class TextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Texture = js.native
    def load(url: String, onLoad: js.Function1[/* texture */ Texture, Unit]): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Texture = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ Texture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Texture = js.native
  }
  
}

