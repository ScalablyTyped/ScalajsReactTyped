package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.examplesJsmLoadersRgbeloaderMod.RGBELoader
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcThreeMod.CubeTexture
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersHdrcubetextureloaderMod {
  
  @JSImport("three/examples/jsm/loaders/HDRCubeTextureLoader", "HDRCubeTextureLoader")
  @js.native
  open class HDRCubeTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var hdrLoader: RGBELoader = js.native
    
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
    def load(
      urls: js.Array[String],
      onLoad: js.Function1[/* texture */ CubeTexture, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): CubeTexture = js.native
    
    def setDataType(`type`: TextureDataType): this.type = js.native
    
    var `type`: TextureDataType = js.native
  }
}
