package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPrwmloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PRWMLoader", "PRWMLoader")
  @js.native
  open class PRWMLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* geometry */ BufferGeometry, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* geometry */ BufferGeometry, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): BufferGeometry = js.native
  }
  /* static members */
  object PRWMLoader {
    
    @JSImport("three/examples/jsm/loaders/PRWMLoader", "PRWMLoader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isBigEndianPlatform(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigEndianPlatform")().asInstanceOf[Boolean]
  }
}
