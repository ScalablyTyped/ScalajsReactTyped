package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/transpose_packed_gpu", JSImport.Namespace)
@js.native
object transposePackedGpuMod extends js.Object {
  @js.native
  class TransposePackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], newDim: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_TransposePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_TransposePackedProgram: Boolean = js.native
    var rank: Double = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

