package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreInstancedBufferGeometryMod.InstancedBufferGeometry
import typingsJapgolly.three.srcLoadersLoaderMod.Loader
import typingsJapgolly.three.srcLoadersLoadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadersBufferGeometryLoaderMod {
  
  @JSImport("three/src/loaders/BufferGeometryLoader", "BufferGeometryLoader")
  @js.native
  open class BufferGeometryLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: Any): InstancedBufferGeometry | BufferGeometry = js.native
  }
}
