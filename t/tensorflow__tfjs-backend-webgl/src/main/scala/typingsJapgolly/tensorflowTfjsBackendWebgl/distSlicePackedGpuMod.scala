package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.ArrayIndexName
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSlicePackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_packed_gpu", "SlicePackedProgram")
  @js.native
  open class SlicePackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_SlicePackedProgram: js.Array[ArrayIndexName] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_SlicePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_SlicePackedProgram: Boolean = js.native
    
    var rank: Double = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
