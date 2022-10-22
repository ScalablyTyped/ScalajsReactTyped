package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.anon.AstcSupported
import typingsJapgolly.three.srcThreeMod.CompressedTexture
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersBasisTextureLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/BasisTextureLoader", "BasisTextureLoader")
  @js.native
  open class BasisTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def detectSupport(renderer: WebGLRenderer): this.type = js.native
    
    def dispose(): Unit = js.native
    
    def load(url: String, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def setTranscoderPath(path: String): this.type = js.native
    
    def setWorkerLimit(workerLimit: Double): this.type = js.native
    
    var transcoderBinary: js.typedarray.ArrayBuffer | Null = js.native
    
    var transcoderPath: String = js.native
    
    var transcoderPending: js.Promise[Unit] | Null = js.native
    
    var workerConfig: AstcSupported = js.native
    
    var workerLimit: Double = js.native
    
    var workerNextTaskID: Double = js.native
    
    var workerPool: js.Array[js.Object] = js.native
    
    var workerSourceURL: String = js.native
  }
}
