package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.DataTexture
import typingsJapgolly.three.srcThreeMod.DataTextureLoader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersTgaloaderMod {
  
  @JSImport("three/examples/jsm/loaders/TGALoader", "TGALoader")
  @js.native
  open class TGALoader () extends DataTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String): DataTexture = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent, Unit]): DataTexture = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): DataTexture = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): DataTexture = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): DataTexture = js.native
  }
}
