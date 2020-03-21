package typingsJapgolly.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsJapgolly.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/clip_packed_gpu", JSImport.Namespace)
@js.native
object clipPackedGpuMod extends js.Object {
  @js.native
  class ClipPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    var maxLoc: WebGLUniformLocation = js.native
    var minLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_ClipPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_ClipPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

