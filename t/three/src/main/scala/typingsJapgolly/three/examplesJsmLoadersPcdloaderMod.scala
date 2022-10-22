package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPcdloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PCDLoader", "PCDLoader")
  @js.native
  open class PCDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    var littleEndian: Boolean = js.native
    
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* points */ Points[BufferGeometry, Material | js.Array[Material]], Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: String, url: String): Points[BufferGeometry, Material | js.Array[Material]] = js.native
    def parse(data: js.typedarray.ArrayBuffer, url: String): Points[BufferGeometry, Material | js.Array[Material]] = js.native
  }
}
