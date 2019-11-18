package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Error
import typingsJapgolly.std.ErrorEvent
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.ProgressEvent
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/MaterialLoader", JSImport.Namespace)
@js.native
object srcLoadersMaterialLoaderMod extends js.Object {
  @js.native
  class MaterialLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    var textures: StringDictionary[Texture] = js.native
    def load(url: String, onLoad: js.Function1[/* material */ Material, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* material */ Material, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ Error | ErrorEvent, Unit]
    ): Unit = js.native
    def parse(json: js.Any): Material = js.native
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
  }
  
}

