package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/select_gpu", JSImport.Namespace)
@js.native
object selectGpuMod extends js.Object {
  @js.native
  class SelectProgram protected () extends GPGPUProgram {
    def this(cRank: Double, shape: js.Array[Double], rank: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

