package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.examplesJsmLoadersMtlloaderMod.MTLLoader.MaterialCreator
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersObjloaderMod {
  
  @JSImport("three/examples/jsm/loaders/OBJLoader", "OBJLoader")
  @js.native
  open class OBJLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* group */ Group, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* group */ Group, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    var materials: MaterialCreator = js.native
    
    def parse(data: String): Group = js.native
    
    def setMaterials(materials: MaterialCreator): this.type = js.native
  }
}
