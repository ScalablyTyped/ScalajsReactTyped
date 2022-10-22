package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.NameString
import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.NameType
import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.Type
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIm2colPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/im2col_packed_gpu", "Im2ColPackedProgram")
  @js.native
  open class Im2ColPackedProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(outputShape: js.Array[Double], convInfo: Conv2DInfo) = this()
    
    @JSName("customUniforms")
    var customUniforms_Im2ColPackedProgram: js.Array[NameType | Type | NameString] = js.native
    
    @JSName("enableShapeUniforms")
    var enableShapeUniforms_Im2ColPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_Im2ColPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_Im2ColPackedProgram: Boolean = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
