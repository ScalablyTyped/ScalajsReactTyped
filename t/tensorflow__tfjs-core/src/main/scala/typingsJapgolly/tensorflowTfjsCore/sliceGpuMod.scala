package typingsJapgolly.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsJapgolly.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/slice_gpu", JSImport.Namespace)
@js.native
object sliceGpuMod extends js.Object {
  @js.native
  class SliceProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    var rank: Double = js.native
    var startLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

