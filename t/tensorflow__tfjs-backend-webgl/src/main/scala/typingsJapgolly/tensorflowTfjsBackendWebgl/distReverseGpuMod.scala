package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReverseGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/reverse_gpu", "ReverseProgram")
  @js.native
  open class ReverseProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
