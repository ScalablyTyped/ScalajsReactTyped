package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.segmentUtilMod.SegOpInfo
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unsortedSegmentSum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/segment_gpu", JSImport.Namespace)
@js.native
object segmentGpuMod extends js.Object {
  @js.native
  class SegmentOpProgram protected () extends GPGPUProgram {
    def this(segOpInfo: SegOpInfo, segOpType: unsortedSegmentSum) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
}

