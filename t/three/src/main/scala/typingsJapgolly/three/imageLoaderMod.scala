package typingsJapgolly.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.three.loaderMod.Loader
import typingsJapgolly.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageLoader", JSImport.Namespace)
@js.native
object imageLoaderMod extends js.Object {
  @js.native
  class ImageLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): HTMLImageElement = js.native
    def load(url: String, onLoad: js.Function1[/* image */ HTMLImageElement, Unit]): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): HTMLImageElement = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): HTMLImageElement = js.native
  }
  
}

