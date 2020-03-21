package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.all
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.any
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.min
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prod
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/reduce_gpu", JSImport.Namespace)
@js.native
object reduceGpuMod extends js.Object {
  @js.native
  class ReduceProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, reduceType: all) = this()
    def this(reduceInfo: ReduceInfo, reduceType: any) = this()
    def this(reduceInfo: ReduceInfo, reduceType: max) = this()
    def this(reduceInfo: ReduceInfo, reduceType: min) = this()
    def this(reduceInfo: ReduceInfo, reduceType: prod) = this()
    def this(reduceInfo: ReduceInfo, reduceType: sum) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

