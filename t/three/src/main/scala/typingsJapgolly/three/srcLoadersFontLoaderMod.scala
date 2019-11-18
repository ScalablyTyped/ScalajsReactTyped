package typingsJapgolly.three

import typingsJapgolly.std.ErrorEvent
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.ProgressEvent
import typingsJapgolly.three.srcExtrasCoreFontMod.Font
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FontLoader", JSImport.Namespace)
@js.native
object srcLoadersFontLoaderMod extends js.Object {
  @js.native
  class FontLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(url: String): Unit = js.native
    def load(url: String, onLoad: js.Function1[/* responseFont */ Font, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* responseFont */ Font, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(json: js.Any): Font = js.native
  }
  
}

