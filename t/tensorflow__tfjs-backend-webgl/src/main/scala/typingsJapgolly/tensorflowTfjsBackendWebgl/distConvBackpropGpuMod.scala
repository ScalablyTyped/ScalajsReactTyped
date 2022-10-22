package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.Conv2DInfo
import typingsJapgolly.tensorflowTfjsCore.distOpsConvUtilMod.Conv3DInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvBackpropGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv2DDerFilterProgram")
  @js.native
  open class Conv2DDerFilterProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv2DDerInputProgram")
  @js.native
  open class Conv2DDerInputProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv3DDerFilterProgram")
  @js.native
  open class Conv3DDerFilterProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/conv_backprop_gpu", "Conv3DDerInputProgram")
  @js.native
  open class Conv3DDerInputProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
