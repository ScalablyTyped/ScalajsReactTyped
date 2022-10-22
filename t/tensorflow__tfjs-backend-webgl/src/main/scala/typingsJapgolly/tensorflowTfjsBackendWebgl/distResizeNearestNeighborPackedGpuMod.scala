package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResizeNearestNeighborPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_nearest_neighbor_packed_gpu", "ResizeNearestNeighborPackedProgram")
  @js.native
  open class ResizeNearestNeighborPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean,
      halfPixelCenters: Boolean
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_ResizeNearestNeighborPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ResizeNearestNeighborPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
