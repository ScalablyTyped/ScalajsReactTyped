package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "StencilOperation")
@js.native
object StencilOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StencilOperation & String] = js.native
  
  @js.native
  sealed trait DecrementClamp
    extends StObject
       with StencilOperation
  /* "decrement-clamp" */ val DecrementClamp: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.DecrementClamp & String = js.native
  
  @js.native
  sealed trait DecrementWrap
    extends StObject
       with StencilOperation
  /* "decrement-wrap" */ val DecrementWrap: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.DecrementWrap & String = js.native
  
  @js.native
  sealed trait IncrementClamp
    extends StObject
       with StencilOperation
  /* "increment-clamp" */ val IncrementClamp: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.IncrementClamp & String = js.native
  
  @js.native
  sealed trait IncrementWrap
    extends StObject
       with StencilOperation
  /* "increment-wrap" */ val IncrementWrap: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.IncrementWrap & String = js.native
  
  @js.native
  sealed trait Invert
    extends StObject
       with StencilOperation
  /* "invert" */ val Invert: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.Invert & String = js.native
  
  @js.native
  sealed trait Keep
    extends StObject
       with StencilOperation
  /* "keep" */ val Keep: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.Keep & String = js.native
  
  @js.native
  sealed trait Replace
    extends StObject
       with StencilOperation
  /* "replace" */ val Replace: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.Replace & String = js.native
  
  @js.native
  sealed trait Zero
    extends StObject
       with StencilOperation
  /* "zero" */ val Zero: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.StencilOperation.Zero & String = js.native
}
