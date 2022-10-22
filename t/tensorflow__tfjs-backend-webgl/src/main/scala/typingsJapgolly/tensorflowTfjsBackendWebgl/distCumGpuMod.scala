package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.Name
import typingsJapgolly.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCumGpuMod {
  
  @js.native
  sealed trait CumOpType extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cum_gpu", "CumOpType")
  @js.native
  object CumOpType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CumOpType & String] = js.native
    
    @js.native
    sealed trait Prod
      extends StObject
         with CumOpType
    /* "*" */ val Prod: typingsJapgolly.tensorflowTfjsBackendWebgl.distCumGpuMod.CumOpType.Prod & String = js.native
    
    @js.native
    sealed trait Sum
      extends StObject
         with CumOpType
    /* "+" */ val Sum: typingsJapgolly.tensorflowTfjsBackendWebgl.distCumGpuMod.CumOpType.Sum & String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cum_gpu", "CumProgram")
  @js.native
  open class CumProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(op: CumOpType, outputShape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
    
    @JSName("customUniforms")
    var customUniforms_CumProgram: js.Array[Name] = js.native
    
    var op: CumOpType = js.native
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
