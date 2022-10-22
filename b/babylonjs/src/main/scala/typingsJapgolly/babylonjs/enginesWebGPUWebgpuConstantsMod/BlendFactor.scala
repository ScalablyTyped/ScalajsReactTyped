package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFactor extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BlendFactor")
@js.native
object BlendFactor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BlendFactor & String] = js.native
  
  @js.native
  sealed trait Constant
    extends StObject
       with BlendFactor
  /* "constant" */ val Constant: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.Constant & String = js.native
  
  @js.native
  sealed trait Dst
    extends StObject
       with BlendFactor
  /* "dst" */ val Dst: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.Dst & String = js.native
  
  @js.native
  sealed trait DstAlpha
    extends StObject
       with BlendFactor
  /* "dst-alpha" */ val DstAlpha: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.DstAlpha & String = js.native
  
  @js.native
  sealed trait One
    extends StObject
       with BlendFactor
  /* "one" */ val One: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.One & String = js.native
  
  @js.native
  sealed trait OneMinusConstant
    extends StObject
       with BlendFactor
  /* "one-minus-constant" */ val OneMinusConstant: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.OneMinusConstant & String = js.native
  
  @js.native
  sealed trait OneMinusDst
    extends StObject
       with BlendFactor
  /* "one-minus-dst" */ val OneMinusDst: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.OneMinusDst & String = js.native
  
  @js.native
  sealed trait OneMinusDstAlpha
    extends StObject
       with BlendFactor
  /* "one-minus-dst-alpha" */ val OneMinusDstAlpha: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.OneMinusDstAlpha & String = js.native
  
  @js.native
  sealed trait OneMinusSrc
    extends StObject
       with BlendFactor
  /* "one-minus-src" */ val OneMinusSrc: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.OneMinusSrc & String = js.native
  
  @js.native
  sealed trait OneMinusSrcAlpha
    extends StObject
       with BlendFactor
  /* "one-minus-src-alpha" */ val OneMinusSrcAlpha: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.OneMinusSrcAlpha & String = js.native
  
  @js.native
  sealed trait Src
    extends StObject
       with BlendFactor
  /* "src" */ val Src: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.Src & String = js.native
  
  @js.native
  sealed trait SrcAlpha
    extends StObject
       with BlendFactor
  /* "src-alpha" */ val SrcAlpha: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.SrcAlpha & String = js.native
  
  @js.native
  sealed trait SrcAlphaSaturated
    extends StObject
       with BlendFactor
  /* "src-alpha-saturated" */ val SrcAlphaSaturated: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.SrcAlphaSaturated & String = js.native
  
  @js.native
  sealed trait Zero
    extends StObject
       with BlendFactor
  /* "zero" */ val Zero: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BlendFactor.Zero & String = js.native
}
