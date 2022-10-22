package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLrnPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_packed_gpu", "LRNPackedProgram")
  @js.native
  open class LRNPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_LRNPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_LRNPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
