package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.Type
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsBackendWebgl.distTexUtilMod.PackingScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecodeMatrixGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/decode_matrix_gpu", "DecodeMatrixProgram")
  @js.native
  open class DecodeMatrixProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("customUniforms")
    var customUniforms_DecodeMatrixProgram: js.Array[Type] = js.native
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_DecodeMatrixProgram: Boolean = js.native
    
    @JSName("outPackingScheme")
    var outPackingScheme_DecodeMatrixProgram: PackingScheme = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    @JSName("outputShape")
    var outputShape_DecodeMatrixProgram: js.Tuple3[Double, Double, Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_DecodeMatrixProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_DecodeMatrixProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
