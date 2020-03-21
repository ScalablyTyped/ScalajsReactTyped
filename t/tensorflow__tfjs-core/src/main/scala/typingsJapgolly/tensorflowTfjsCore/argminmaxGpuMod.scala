package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/argminmax_gpu", JSImport.Namespace)
@js.native
object argminmaxGpuMod extends js.Object {
  @js.native
  class ArgMinMaxProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, op: max, firstPass: Boolean) = this()
    def this(reduceInfo: ReduceInfo, op: min, firstPass: Boolean) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

