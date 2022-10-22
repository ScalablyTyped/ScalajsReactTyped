package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFlipLeftRightGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/flip_left_right_gpu", "FlipLeftRightProgram")
  @js.native
  open class FlipLeftRightProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(imageShape: js.Tuple4[Double, Double, Double, Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
