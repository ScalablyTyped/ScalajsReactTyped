package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.Name
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFillGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/fill_gpu", "FillProgram")
  @js.native
  open class FillProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(shape: js.Array[Double], value: Double) = this()
    
    @JSName("customUniforms")
    var customUniforms_FillProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
