package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendOperation extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BlendOperation")
@js.native
object BlendOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlendOperation & String] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with BlendOperation
  /* "add" */ val Add: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendOperation.Add & String = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with BlendOperation
  /* "max" */ val Max: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendOperation.Max & String = js.native
  
  @js.native
  sealed trait Min
    extends StObject
       with BlendOperation
  /* "min" */ val Min: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendOperation.Min & String = js.native
  
  @js.native
  sealed trait ReverseSubtract
    extends StObject
       with BlendOperation
  /* "reverse-subtract" */ val ReverseSubtract: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendOperation.ReverseSubtract & String = js.native
  
  @js.native
  sealed trait Subtract
    extends StObject
       with BlendOperation
  /* "subtract" */ val Subtract: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendOperation.Subtract & String = js.native
}
