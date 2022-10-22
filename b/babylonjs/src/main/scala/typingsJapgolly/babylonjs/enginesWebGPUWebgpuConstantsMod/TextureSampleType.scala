package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureSampleType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "TextureSampleType")
@js.native
object TextureSampleType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextureSampleType & String] = js.native
  
  @js.native
  sealed trait Depth
    extends StObject
       with TextureSampleType
  /* "depth" */ val Depth: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureSampleType.Depth & String = js.native
  
  @js.native
  sealed trait Float
    extends StObject
       with TextureSampleType
  /* "float" */ val Float: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureSampleType.Float & String = js.native
  
  @js.native
  sealed trait Sint
    extends StObject
       with TextureSampleType
  /* "sint" */ val Sint: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureSampleType.Sint & String = js.native
  
  @js.native
  sealed trait Uint
    extends StObject
       with TextureSampleType
  /* "uint" */ val Uint: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureSampleType.Uint & String = js.native
  
  @js.native
  sealed trait UnfilterableFloat
    extends StObject
       with TextureSampleType
  /* "unfilterable-float" */ val UnfilterableFloat: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.TextureSampleType.UnfilterableFloat & String = js.native
}
