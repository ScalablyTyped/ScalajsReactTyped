package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.OnProgressCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoProgressMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def monitorPromisesProgress(promises: js.Array[js.Promise[js.Object | Unit]], onProgress: OnProgressCallback): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorPromisesProgress")(promises.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  inline def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double
  ): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorPromisesProgress")(promises.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], startFraction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  inline def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double,
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorPromisesProgress")(promises.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], startFraction.asInstanceOf[js.Any], endFraction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  inline def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Unit,
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorPromisesProgress")(promises.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], startFraction.asInstanceOf[js.Any], endFraction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
}
