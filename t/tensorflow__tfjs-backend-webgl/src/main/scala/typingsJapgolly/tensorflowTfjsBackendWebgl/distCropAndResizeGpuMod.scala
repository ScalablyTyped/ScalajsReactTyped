package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typingsJapgolly.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCropAndResizeGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/crop_and_resize_gpu", "CropAndResizeProgram")
  @js.native
  open class CropAndResizeProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      imageShape: js.Tuple4[Double, Double, Double, Double],
      boxShape: js.Tuple2[Double, Double],
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
