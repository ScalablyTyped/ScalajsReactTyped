package typingsJapgolly.threeGifLoader

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.omggif.mod.GifReader
import typingsJapgolly.three.mod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("three-gif-loader", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GifLoader {
    def this(manager: LoadingManager) = this()
  }
  
  @js.native
  trait GifLoader extends StObject {
    
    def load(url: String, onLoad: js.Function1[/* reader */ GifReader, Unit]): typingsJapgolly.threeGifLoader.libGifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): typingsJapgolly.threeGifLoader.libGifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): typingsJapgolly.threeGifLoader.libGifTextureMod.default = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* reader */ GifReader, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): typingsJapgolly.threeGifLoader.libGifTextureMod.default = js.native
    
    def setPath(value: String): Unit = js.native
  }
}
