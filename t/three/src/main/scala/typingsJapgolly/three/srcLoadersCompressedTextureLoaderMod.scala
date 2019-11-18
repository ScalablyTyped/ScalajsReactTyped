package typingsJapgolly.three

import typingsJapgolly.std.ErrorEvent
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.ProgressEvent
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsJapgolly.three.srcTexturesCompressedTextureMod.CompressedTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/CompressedTextureLoader", JSImport.Namespace)
@js.native
object srcLoadersCompressedTextureLoaderMod extends js.Object {
  @js.native
  class CompressedTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
  
}

