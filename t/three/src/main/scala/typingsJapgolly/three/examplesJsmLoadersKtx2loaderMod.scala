package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import typingsJapgolly.three.srcThreeMod.CompressedTexture
import typingsJapgolly.three.srcThreeMod.CompressedTextureLoader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersKtx2loaderMod {
  
  @JSImport("three/examples/jsm/loaders/KTX2Loader", "KTX2Loader")
  @js.native
  open class KTX2Loader () extends CompressedTextureLoader {
    def this(manager: LoadingManager) = this()
    
    def detectSupport(renderer: WebGLRenderer): KTX2Loader = js.native
    
    def dispose(): KTX2Loader = js.native
    
    def parse(buffer: js.typedarray.ArrayBuffer, onLoad: js.Function1[/* texture */ CompressedTexture, Unit]): KTX2Loader = js.native
    def parse(
      buffer: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* texture */ CompressedTexture, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): KTX2Loader = js.native
    
    def setTranscoderPath(path: String): KTX2Loader = js.native
    
    def setWorkerLimit(limit: Double): KTX2Loader = js.native
  }
}
