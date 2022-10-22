package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareFunction extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "CompareFunction")
@js.native
object CompareFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CompareFunction & String] = js.native
  
  @js.native
  sealed trait Always
    extends StObject
       with CompareFunction
  /* "always" */ val Always: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.Always & String = js.native
  
  @js.native
  sealed trait Equal
    extends StObject
       with CompareFunction
  /* "equal" */ val Equal: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.Equal & String = js.native
  
  @js.native
  sealed trait Greater
    extends StObject
       with CompareFunction
  /* "greater" */ val Greater: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.Greater & String = js.native
  
  @js.native
  sealed trait GreaterEqual
    extends StObject
       with CompareFunction
  /* "greater-equal" */ val GreaterEqual: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.GreaterEqual & String = js.native
  
  @js.native
  sealed trait Less
    extends StObject
       with CompareFunction
  /* "less" */ val Less: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.Less & String = js.native
  
  @js.native
  sealed trait LessEqual
    extends StObject
       with CompareFunction
  /* "less-equal" */ val LessEqual: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.LessEqual & String = js.native
  
  @js.native
  sealed trait Never
    extends StObject
       with CompareFunction
  /* "never" */ val Never: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.Never & String = js.native
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with CompareFunction
  /* "not-equal" */ val NotEqual: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CompareFunction.NotEqual & String = js.native
}
