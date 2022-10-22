package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.Name
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMultinomialGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/multinomial_gpu", "MultinomialProgram")
  @js.native
  open class MultinomialProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(batchSize: Double, numOutcomes: Double, numSamples: Double) = this()
    
    @JSName("customUniforms")
    var customUniforms_MultinomialProgram: js.Array[Name] = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
