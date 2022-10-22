package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.examplesJsmMiscVolumeMod.Volume
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersNrrdloaderMod {
  
  @JSImport("three/examples/jsm/loaders/NRRDLoader", "NRRDLoader")
  @js.native
  open class NRRDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var fieldFunctions: js.Object = js.native
    
    def load(url: String, onLoad: js.Function1[/* group */ Volume, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Volume, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Volume, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Volume, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    @JSName("manager")
    var manager_NRRDLoader: LoadingManager = js.native
    
    def parse(data: String): Volume = js.native
    
    def parseChars(array: js.Array[Double]): String = js.native
    def parseChars(array: js.Array[Double], start: Double): String = js.native
    def parseChars(array: js.Array[Double], start: Double, end: Double): String = js.native
    def parseChars(array: js.Array[Double], start: Unit, end: Double): String = js.native
  }
}
