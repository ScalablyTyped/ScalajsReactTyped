package typingsJapgolly.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsJapgolly.three.srcTexturesCubeTextureMod.CubeTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CubeTextureLoader", JSImport.Namespace)
@js.native
object srcLoadersCubeTextureLoaderMod extends js.Object {
  @js.native
  class CubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(urls: js.Array[String]): CubeTexture = js.native
    def load(urls: js.Array[String], onLoad: js.Function1[/* texture */ CubeTexture, Unit]): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): CubeTexture = js.native
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
  }
  
}

